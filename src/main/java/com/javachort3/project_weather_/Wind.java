package com.javachort3.project_weather_;

public class Wind {
    private String Chill;
    private String direction;
    private String speed;

    public Wind(String chill, String direction, String speed) {
        Chill = chill;
        this.direction = direction;
        this.speed = speed;
    }

    public String getChill() {
        return Chill;
    }

    public String getDirection() {
        return direction;
    }

    public String getSpeed() {
        return speed;
    }

}
