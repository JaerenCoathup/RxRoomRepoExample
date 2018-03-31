package com.example.jaerencoathup.exampleapp.interactors.Memory;

import com.example.jaerencoathup.exampleapp.persistence.ForecastEntity;

import io.reactivex.Observable;

/**
 * Created by jaerencoathup on 25/03/2018.
 */

public interface WeatherMemoryInteractor {
    Observable<ForecastEntity> getWeatherData();
    void saveData(ForecastEntity weatherData);
}
