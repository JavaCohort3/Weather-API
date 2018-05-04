package com.javachort3.project_weather_;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GUID {

    private boolean isPermalink;

    public GUID() {}

    public boolean getIsPermalink() {
        return isPermalink;
    }

    public void setIsPermalink(boolean isPermalink) {
        this.isPermalink = isPermalink;
    }

    @Override
    public String toString() {
        return "GUID{" +
                "isPermalink='" + isPermalink + '\'' +
                '}';
    }
}
