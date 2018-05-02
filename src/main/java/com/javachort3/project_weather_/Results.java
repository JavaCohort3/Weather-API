package com.javachort3.project_weather_;

import java.nio.channels.Channel;

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

