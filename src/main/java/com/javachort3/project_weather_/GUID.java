package com.javachort3.project_weather_;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GUID {

    private String isPermalink;

    public GUID() {

    }

    public String getIsPermalink() {
        return isPermalink;
    }

    public void setIsPermalink(String isPermalink) {
        this.isPermalink = isPermalink;
    }

    @Override
    public String toString() {
        return "GUID{" +
                "isPermalink='" + isPermalink + '\'' +
                '}';
    }
}
