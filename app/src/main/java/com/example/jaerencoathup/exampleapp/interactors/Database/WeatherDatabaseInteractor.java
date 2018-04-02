package com.example.jaerencoathup.exampleapp.interactors.Database;

import com.example.jaerencoathup.exampleapp.persistence.WeatherData;

import io.reactivex.Maybe;

/**
 * Created by jaerencoathup on 30/03/2018.
 */

public interface WeatherDatabaseInteractor {
    Maybe<WeatherData> getWeatherData(String name);
    void saveData(WeatherData weatherData);
}
