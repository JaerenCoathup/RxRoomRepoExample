package com.example.jaerencoathup.exampleapp.Networking.Repositories.Forecast;

import com.example.jaerencoathup.exampleapp.Networking.ApiService;
import com.example.jaerencoathup.exampleapp.Networking.Repositories.RepositoryTemplate;
import com.example.jaerencoathup.exampleapp.Persistence.ForecastData;

import javax.inject.Inject;

import io.reactivex.Observable;


/**
 * Created by jaerencoathup on 03/11/2017.
 */

public class WeatherRepositoryImpl extends RepositoryTemplate implements WeatherRepository {

    ApiService apiService;

    @Inject
    public WeatherRepositoryImpl(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public Observable<ForecastData> getForecastData() {

    }
}
