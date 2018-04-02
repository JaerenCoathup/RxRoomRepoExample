package com.example.jaerencoathup.exampleapp.interactors.Network;

import com.example.jaerencoathup.exampleapp.persistence.WeatherData;

import io.reactivex.Single;

/**
 * Created by jaerencoathup on 25/03/2018.
 */

public interface WeatherNetworkInteractor {
    Single<WeatherData> getWeatherData(String city);
}
