package com.javachort3.project_weather_;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YahooAPI {
    private Query query;

    public YahooAPI() {}

    public Query getQuery() {   return query;   }

    public void setQuery(Query query) { this.query = query; }

    @Override
    public String toString() {
        return "YahooAPI{" +
                "query=" + query +
                '}';
    }
}
