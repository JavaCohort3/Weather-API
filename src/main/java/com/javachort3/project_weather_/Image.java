package com.javachort3.project_weather_;

public class Image {
    private String title, width, height, link, url;


    public Image(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Image{" +
                "title='" + title + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", link='" + link + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
