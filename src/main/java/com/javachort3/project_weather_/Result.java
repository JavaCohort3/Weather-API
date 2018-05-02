package com.javachort3.project_weather_;

import java.nio.channels.Channel;

public class Result {
    private Channel channel;

    public Result(Channel channel) {
        this.channel = channel;
    }

    public Channel getChannel() {
        return channel;
    }
}
