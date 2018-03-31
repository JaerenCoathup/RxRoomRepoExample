package com.example.jaerencoathup.exampleapp.interactors.Database;

import com.example.jaerencoathup.exampleapp.persistence.ForecastEntity;

import io.reactivex.Observable;

/**
 * Created by jaerencoathup on 30/03/2018.
 */

public interface WeatherDatabaseInteractor {
    Observable<ForecastEntity> getWeatherData(String name);
    void saveData(ForecastEntity weatherData);
}
