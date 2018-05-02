package com.javachort3.project_weather_;

import java.util.Date;

public class Condition {

    private String code;
    private Date date;
    private String temp;
    private String text;

    public Condition () {
    }

    public String getCode() {
        return code;
    }

    public Date getDate() {
        return date;
    }

    public String getTemp() {
        return temp;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "code='" + code + '\'' +
                ", date=" + date +
                ", temp='" + temp + '\'' +
                ", text='" + text + '\'' +
                '}';
    }



}
