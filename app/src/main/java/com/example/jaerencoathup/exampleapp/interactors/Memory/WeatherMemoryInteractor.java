package com.example.jaerencoathup.exampleapp.interactors.Memory;

import com.example.jaerencoathup.exampleapp.persistence.WeatherData;

import io.reactivex.Maybe;
import io.reactivex.Observable;

/**
 * Created by jaerencoathup on 25/03/2018.
 */

public interface WeatherMemoryInteractor {
    Maybe<WeatherData> getWeatherData();
    Observable<WeatherData> getWeatherDataObservable();
    void saveData(WeatherData weatherData);
}
