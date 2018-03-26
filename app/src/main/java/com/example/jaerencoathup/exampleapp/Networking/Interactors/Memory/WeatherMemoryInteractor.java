package com.example.jaerencoathup.exampleapp.Networking.Interactors.Memory;

import com.example.jaerencoathup.exampleapp.Persistence.WeatherData;

import io.reactivex.Observable;

/**
 * Created by jaerencoathup on 25/03/2018.
 */

public interface WeatherMemoryInteractor {
    Observable<WeatherData> getWeatherData(String city);
    void saveData(WeatherData weatherData);
}
