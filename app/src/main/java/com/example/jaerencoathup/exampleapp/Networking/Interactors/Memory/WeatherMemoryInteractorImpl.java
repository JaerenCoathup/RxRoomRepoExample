package com.example.jaerencoathup.exampleapp.Networking.Interactors.Memory;

import com.example.jaerencoathup.exampleapp.Persistence.WeatherData;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;

/**
 * Created by jaerencoathup on 26/03/2018.
 */

public class WeatherMemoryInteractorImpl implements WeatherMemoryInteractor {

    BehaviorSubject<WeatherData> observable;

    public WeatherMemoryInteractorImpl() {
        observable = BehaviorSubject.create();
    }

    @Override
    public Observable<WeatherData> getWeatherData(String city) {
        return observable;
    }

    @Override
    public void saveData(WeatherData weatherData) {
        observable.onNext(weatherData);
    }
}
