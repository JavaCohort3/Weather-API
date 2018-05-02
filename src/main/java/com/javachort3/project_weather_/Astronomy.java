package com.javachort3.project_weather_;

public class Astronomy {
    private String chill;
    private String direction;
    private String speed;

    public Astronomy(String chill, String direction, String speed) {
        this.chill = chill;
        this.direction = direction;
        this.speed = speed;
    }

    public String getChill() {
        return chill;
    }

    public String getDirection() {
        return direction;
    }

    public String getSpeed() {
        return speed;
    }
}
