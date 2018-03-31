package com.example.jaerencoathup.exampleapp.interactors.Memory;

import com.example.jaerencoathup.exampleapp.persistence.ForecastEntity;
import javax.inject.Inject;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;

/**
 * Created by jaerencoathup on 26/03/2018.
 */

public class WeatherMemoryInteractorImpl implements WeatherMemoryInteractor {

    BehaviorSubject<ForecastEntity> observable;

    @Inject
    public WeatherMemoryInteractorImpl() {
        observable = BehaviorSubject.create();
    }

    @Override
    public Observable<ForecastEntity> getWeatherData() {
        return observable;
    }

    @Override
    public void saveData(ForecastEntity weatherData) {
        observable.onNext(weatherData);
    }
}
