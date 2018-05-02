package com.javachort3.project_weather_;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.nio.channels.Channel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
    private Channel channel;

    public Results() {

    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Results{" +
                "channel=" + channel +
                '}';
    }
}

