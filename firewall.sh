#!/bin/bash
iptables -A OUTPUT -p tcp --dport 61616 -j ACCEPT;
echo "OUTPUT ok";
iptables -A INPUT -i docker0 -p tcp --sport 61616 -m state --state ESTABLISHED,RELATED -j ACCEPT;
echo "INPUT ok";

iptables -A OUTPUT -p tcp --dport 27017 -j ACCEPT;
echo  "OUTPUT mongo ok";
iptables -A INPUT -i docker0 -p tcp --sport 27017 -m state --state ESTABLISHED,RELATED -j ACCEPT;
echo  "INPUT mongo ok";
