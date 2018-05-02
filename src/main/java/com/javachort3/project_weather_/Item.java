package aermias.Weather_API_Project;

import java.util.Arrays;

public class Item {
    private String title;
    private String lat;
    private String long_;
    private String link;
    private String pubDate;
    private Condition condition;
    private Forecast[] forecasts;
    private String description;
    private GUID guid;

    public Item() {}

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getLat() { return lat; }
    public void setLat(String lat) { this.lat = lat; }

    public String getLong_() { return long_; }
    public void setLong_(String long_) { this.long_ = long_; }

    public String getLink() { return link; }
    public void setLink(String link) { this.link = link; }

    public String getPubDate() { return pubDate; }
    public void setPubDate(String pubDate) { this.pubDate = pubDate; }

    public Condition getCondition() { return condition; }
    public void setCondition(Condition condition) { this.condition = condition; }

    public Forecast[] getForecasts() { return forecasts; }
    public void setForecasts(Forecast[] forecasts) { this.forecasts = forecasts; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public GUID getGuid() { return guid; }
    public void setGuid(GUID guid) { this.guid = guid; }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", lat='" + lat + '\'' +
                ", long_='" + long_ + '\'' +
                ", link='" + link + '\'' +
                ", pubDate='" + pubDate + '\'' +
                ", condition=" + condition +
                ", forecasts=" + Arrays.toString(forecasts) +
                ", description='" + description + '\'' +
                ", guid=" + guid +
                '}';
    }
}