package com.sachin.yahoo.weather.app.listener;

import com.sachin.yahoo.weather.app.data.Channel;

public interface WeatherServiceListener {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
