package com.example.jaerencoathup.exampleapp.repositories.weather;

import com.example.jaerencoathup.exampleapp.persistence.WeatherData;

import io.reactivex.Observable;

/**
 * Created by jaerencoathup on 03/11/2017.
 */

public interface WeatherRepository {
    Observable<WeatherData> getForecastData();
}
