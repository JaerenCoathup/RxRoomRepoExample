package com.example.jaerencoathup.exampleapp.interactors.Database;

import com.example.jaerencoathup.exampleapp.interactors.Memory.WeatherMemoryInteractor;
import com.example.jaerencoathup.exampleapp.persistence.WeatherData;
import com.example.jaerencoathup.exampleapp.persistence.WeatherDatabase;
import javax.inject.Inject;

import io.reactivex.Maybe;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by jaerencoathup on 30/03/2018.
 */

public class WeatherDatabaseInteractorImpl implements WeatherDatabaseInteractor {

    WeatherDatabase weatherDatabase;
    WeatherMemoryInteractor memoryInteractor;

    @Inject
    public WeatherDatabaseInteractorImpl(WeatherDatabase weatherDatabase, WeatherMemoryInteractor memoryInteractor) {
        this.weatherDatabase = weatherDatabase;
        this.memoryInteractor = memoryInteractor;
    }

    @Override
    public Maybe<WeatherData> getWeatherData(String name) {
        return weatherDatabase.weatherDao().getWeather(name)
                .subscribeOn(Schedulers.io())
                .doOnSuccess(memoryInteractor::saveData);
    }

    @Override
    public void saveData(WeatherData weatherEntity) {
        weatherDatabase.weatherDao().saveData(weatherEntity);
    }
}
