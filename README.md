# Weather API Project

**Java Cohort 3 - 1 May 2018**

---

This project is designed to pull JSON data from the [Yahoo API for Wilmington, DE](https://query.yahooapis.com/v1/public/yql?q=select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"wilmington, de\")&format=json) and return it as a Java object every 30 seconds.

---

Things needed to complete this project:
* API Consumer - to parse the JSON weather data
* Task Scheduler - to repeat the method at a set interval
* Rest Controller - to host a local server for the HTML file
