package com.javachort3.project_weather_;

public class Forecast {

    private String code;
    private String date;
    private String day;
    private String high;
    private String low;
    private String text;

    public Forecast(){

    }

    @Override
    public String toString() {
        return "Forecast{" +
                "code='" + code + '\'' +
                ", date='" + date + '\'' +
                ", day='" + day + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
