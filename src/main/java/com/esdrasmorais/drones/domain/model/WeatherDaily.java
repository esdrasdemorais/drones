package com.esdrasmorais.drones.domain.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class WeatherDaily extends Weather {
	private static final String endPoint = "http://api.openweathermap.org/data/2.5/weather?";
	private static final String appKey = "&APPID=09a10b08f2021dca1bcadd870a74e489";
	private static final String coordinates = "lat=38.307195&lon=-7.589377";
	
	protected Double directionInDegree;
	
	public WeatherDaily() 
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
	
		this.setWeatherDaily(json);
	}
	
	private void setWeatherDaily(JsonObject jsonObject) {
		this.setPrecipitationInMilimeter(
			jsonObject.get("weather").getAsJsonObject().
			get("0").getAsJsonObject().get("main").toString().
			toLowerCase() == "rain" ? 0.7 : 0
		);
		
		this.setWindSpeedInMeterPerSecond(
			jsonObject.get("wind").getAsJsonObject().
			get("speed").getAsDouble()
		);
	}
}
