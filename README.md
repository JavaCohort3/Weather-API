# Weather API Project

## Java Cohort 3 - 1 May 2018
---

This project is designed to pull JSON data from the [Yahoo API](https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22wilmington%2C%20de%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys) and return it as a Java object every 30 seconds.
