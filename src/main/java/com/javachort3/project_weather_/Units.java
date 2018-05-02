package com.javachort3.project_weather_;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Units {
    private String distance, pressure, speed, temp;

    public Units(){

    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Units{" +
                "distance='" + distance + '\'' +
                ", pressure='" + pressure + '\'' +
                ", speed='" + speed + '\'' +
                ", temp='" + temp + '\'' +
                '}';
    }
}

