package com.jermaine.weatherastronomyWind;

import java.nio.channels.Channel;

public class Result {
    private Channel channel;

    public Result() {

    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Result{" +
                "channel=" + channel +
                '}';
    }
}

