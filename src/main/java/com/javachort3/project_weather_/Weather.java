package com.javachort3.project_weather_;

public class Weather {

    private Query query;

    public Weather(Query query) {
        this.query = query;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "query=" + query +
                '}';
    }
}





