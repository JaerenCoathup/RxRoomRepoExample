package com.example.jaerencoathup.exampleapp.interactors.Database;

import com.example.jaerencoathup.exampleapp.interactors.Memory.WeatherMemoryInteractor;
import com.example.jaerencoathup.exampleapp.persistence.ForecastEntity;
import com.example.jaerencoathup.exampleapp.persistence.WeatherDatabase;
import javax.inject.Inject;
import io.reactivex.Observable;
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

    /* Listens to the datbase for changes
    * Returns the weather that is for the users current city.
    */
    @Override
    public Observable<ForecastEntity> getWeatherData(String name) {
        return weatherDatabase.weatherDao().getWeather(name).toObservable()
                .subscribeOn(Schedulers.io())
                .doOnNext(memoryInteractor::saveData);
    }

    @Override
    public void saveData(ForecastEntity weatherEntity) {
        weatherDatabase.weatherDao().saveData(weatherEntity);
    }
}
