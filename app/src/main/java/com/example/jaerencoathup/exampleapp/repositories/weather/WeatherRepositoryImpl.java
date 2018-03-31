package com.example.jaerencoathup.exampleapp.repositories.weather;

import com.example.jaerencoathup.exampleapp.interactors.Database.WeatherDatabaseInteractor;
import com.example.jaerencoathup.exampleapp.interactors.Memory.WeatherMemoryInteractor;
import com.example.jaerencoathup.exampleapp.interactors.Network.WeatherNetworkInteractor;
import com.example.jaerencoathup.exampleapp.persistence.ForecastEntity;
import com.example.jaerencoathup.exampleapp.repositories.RepositoryTemplate;
import com.example.jaerencoathup.exampleapp.session.SessionService;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;


/**
 * Created by jaerencoathup on 03/11/2017.
 */

public class WeatherRepositoryImpl extends RepositoryTemplate implements WeatherRepository {

    SessionService sessionService;

    Disposable dataProviderDisposable;

    WeatherNetworkInteractor networkInteractor;

    WeatherDatabaseInteractor databaseInteractor;

    WeatherMemoryInteractor memoryInteractor;

    @Inject
    public WeatherRepositoryImpl(SessionService sessionService,
                                 WeatherNetworkInteractor networkInteractor,
                                 WeatherDatabaseInteractor databaseInteractor,
                                 WeatherMemoryInteractor memoryInteractor) {
        this.sessionService = sessionService;
        this.networkInteractor = networkInteractor;
        this.databaseInteractor = databaseInteractor;
        this.memoryInteractor = memoryInteractor;
    }

    @Override
    public Observable<ForecastEntity> getForecastData() {
        String currentLocationName = sessionService.getLocation();
        Observable<ForecastEntity> memoryObservable = memoryInteractor.getWeatherData();
        Observable<ForecastEntity> databaseObservable = databaseInteractor.getWeatherData(currentLocationName);
        Observable<ForecastEntity> networkObservable = networkInteractor.getWeatherData(currentLocationName).toObservable();
        if (!isNetworkInProgress()) {
            dataProviderDisposable = Observable.merge(memoryObservable, Observable.concat(databaseObservable, networkObservable))
                    .filter(data -> data.name.equals(sessionService.getLocation()))
                    .filter(ForecastEntity::isDataInDate)
                    .firstElement()
                    .subscribe((boosterData) -> {}, this::handleNonHttpException);
        }

        return memoryInteractor.getWeatherData();
    }

    private boolean isNetworkInProgress() {
        return dataProviderDisposable != null && !dataProviderDisposable.isDisposed();
    }
}
