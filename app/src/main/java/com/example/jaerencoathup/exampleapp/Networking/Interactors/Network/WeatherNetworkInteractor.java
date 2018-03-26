package com.example.jaerencoathup.exampleapp.Networking.Interactors.Network;

import com.example.jaerencoathup.exampleapp.Persistence.WeatherData;
import io.reactivex.Single;

/**
 * Created by jaerencoathup on 25/03/2018.
 */

public interface WeatherNetworkInteractor {
    Single<WeatherData> getWeatherData(String city);
}
