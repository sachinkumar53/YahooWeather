package com.sachin.yahoo.weather.app.listener;

import com.sachin.yahoo.weather.app.data.LocationResult;

public interface GeocodingServiceListener {
    void geocodeSuccess(LocationResult location);

    void geocodeFailure(Exception exception);
}
