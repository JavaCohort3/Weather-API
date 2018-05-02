package com.javachort3.project_weather_;

public class Location {
    private String city;
    private String country;
    private String region;

    public Location(){

    }

    @Override
    public String toString() {
        return "Location{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
