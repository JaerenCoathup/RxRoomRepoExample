package com.example.jaerencoathup.exampleapp.interactors.Memory;

import com.example.jaerencoathup.exampleapp.persistence.WeatherData;
import javax.inject.Inject;

import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;

/**
 * Created by jaerencoathup on 26/03/2018.
 */

public class WeatherMemoryInteractorImpl implements WeatherMemoryInteractor {

    BehaviorSubject<WeatherData> observable;
    WeatherData weatherData;

    @Inject
    public WeatherMemoryInteractorImpl() {
        observable = BehaviorSubject.create();
    }

    @Override
    public void saveData(WeatherData weatherData) {
        this.weatherData = weatherData;
        observable.onNext(weatherData);
    }

    @Override
    public Maybe<WeatherData> getWeatherData() {
        return weatherData == null ? Maybe.empty() : Maybe.just(weatherData);
    }

    @Override
    public Observable<WeatherData> getWeatherDataObservable() {
        return observable;
    }


}
