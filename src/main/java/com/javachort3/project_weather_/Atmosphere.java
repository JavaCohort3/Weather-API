package com.javachort3.project_weather_;

public class Atmosphere {

    private String humidity;
    private String pressure;
    private String rising;
    private String visibility;


    public Atmosphere() {
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setRising(String rising) {
        this.rising = rising;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @Override
    public String toString() {
        return "Atmosphere{" +
                "humidity='" + humidity + '\'' +
                ", pressure='" + pressure + '\'' +
                ", rising='" + rising + '\'' +
                ", visibility='" + visibility + '\'' +
                '}';
    }

}
