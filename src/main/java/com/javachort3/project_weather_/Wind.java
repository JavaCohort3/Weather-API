package com.javachort3.project_weather_;

public class Wind {
    private String Chill;
    private String direction;
    private String speed;

    public Wind() {
        }

    public String getChill() {
        return Chill;
    }

    public void setChill(String chill) {
        Chill = chill;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "Chill='" + Chill + '\'' +
                ", direction='" + direction + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}
