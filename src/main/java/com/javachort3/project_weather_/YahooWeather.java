package com.javachort3.project_weather_;

public class YahooWeather {
    public Query query;

    public YahooWeather() {
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return "YahooWeather{" +
                "query=" + query +
                '}';
    }
}
