package com.esdrasmorais.drones.domain.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class WeatherForecast extends Weather {
	private static final String endPoint = "http://api.openweathermap.org/data/2.5/forecast?";
	private static final String appKey = "&APPID=09a10b08f2021dca1bcadd870a74e489";
	private static final String coordinates = "lat=38.307195&lon=-7.589377";
	
	protected Double directionInDegree;
	
	public WeatherForecast(Frequency scheduleFrequency) 
		throws MalformedURLException, IOException
	{
		URL url = new URL(this.endPoint + this.coordinates + this.appKey);
		
		URLConnection urlConnection = url.openConnection();
		
//		PrintStream ps = new PrintStream(urlConnection.getOutputStream());
		HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
		
		httpURLConnection.setRequestMethod("GET");
//		httpURLConnection.setRequestProperty("User-Agent", USER_AGENT);
		Integer responseCode = httpURLConnection.getResponseCode();
		
		BufferedReader bufferedReader = new BufferedReader(
			new InputStreamReader(httpURLConnection.getInputStream())
		);
		
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = bufferedReader.readLine()) != null) {
			response.append(inputLine);
		}
		bufferedReader.close();
		
		Gson gson = new Gson();
		JsonObject json = new JsonObject();
		json = gson.fromJson(response.toString(), JsonObject.class);		
		
		this.setWeatherForecast(json, scheduleFrequency);
	}
	
	private void setWeatherForecast(JsonObject json, 
		Frequency scheduleFrequency)
	{
		switch(scheduleFrequency) {
			case DAILY:
				this.setDailyWeatherForecast(json);
				break;
		}
	}
	
	private void setDailyWeatherForecast(JsonObject jsonObject) {
//		Map<String, Object> attributes = new HashMap<String, Object>();
//		Set<Entry<String, JsonElement>> entrySet = jsonObject.entrySet();
//		for(Map.Entry<String, JsonElement> entry : entrySet) {
//			attributes.put(entry.getKey(), jsonObject.get(entry.getKey()));
//		}
//        for(Map.Entry<String,Object> att : attributes.entrySet()){
//            System.out.println("key >>> "+att.getKey());
//            System.out.println("val >>> "+att.getValue());
//            } 
		this.setPrecipitationInMilimeter(
			jsonObject.get("list").getAsJsonObject().
				get("1").getAsJsonObject().get("weather").
				getAsJsonObject().get("0").getAsJsonObject().
				get("main").toString().toLowerCase() == "rain" 
//			|| jsonObject.get("list").getAsJsonObject().
//				get("1").getAsJsonObject().get("rain").
//				getAsJsonObject().get("3h").getAsDouble() > 0.0 
			? jsonObject.get("list").getAsJsonObject().
				get("1").getAsJsonObject().get("rain").
				getAsJsonObject().get("3h").getAsDouble() : 0
		);
		
		this.setWindSpeedInMeterPerSecond(
			jsonObject.get("list").getAsJsonObject().
			get("1").getAsJsonObject().get("wind").
			getAsJsonObject().get("speed").getAsDouble()
		);
	}
}
