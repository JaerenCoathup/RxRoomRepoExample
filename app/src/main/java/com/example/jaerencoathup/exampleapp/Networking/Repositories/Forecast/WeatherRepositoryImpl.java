package com.example.jaerencoathup.exampleapp.Networking.Repositories.Forecast;

import com.example.jaerencoathup.exampleapp.Networking.Interactors.Memory.WeatherMemoryInteractor;
import com.example.jaerencoathup.exampleapp.Networking.Interactors.Network.WeatherNetworkInteractor;
import com.example.jaerencoathup.exampleapp.Networking.Repositories.RepositoryTemplate;
import com.example.jaerencoathup.exampleapp.Persistence.WeatherData;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;


/**
 * Created by jaerencoathup on 03/11/2017.
 */

public class WeatherRepositoryImpl extends RepositoryTemplate implements WeatherRepository {

    Disposable dataProviderDisposable;

    WeatherNetworkInteractor networkInteractor;

    WeatherMemoryInteractor memoryInteractor;

    @Inject
    public WeatherRepositoryImpl(WeatherNetworkInteractor networkInteractor, WeatherMemoryInteractor memoryInteractor) {
        this.networkInteractor = networkInteractor;
        this.memoryInteractor = memoryInteractor;
    }

    @Override
    public Observable<WeatherData> getForecastData(String city) {
        Observable<WeatherData> memoryObservable = memoryInteractor.getWeatherData(city);
        Observable<WeatherData> networkObservable = networkInteractor.getWeatherData(city).toObservable();
        if (!isNetworkInProgress()) {
            dataProviderDisposable = Observable.merge(memoryObservable, networkObservable)
                    .firstElement()
                    .subscribe((boosterData) -> {}, this::handleNonHttpException);
        }

        return memoryInteractor.getWeatherData(city);
    }

    private boolean isNetworkInProgress() {
        return dataProviderDisposable != null && !dataProviderDisposable.isDisposed();
    }
}
