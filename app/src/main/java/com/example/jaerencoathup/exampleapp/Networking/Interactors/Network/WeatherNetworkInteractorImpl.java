package com.example.jaerencoathup.exampleapp.Networking.Interactors.Network;

import com.example.jaerencoathup.exampleapp.Networking.ApiService;
import com.example.jaerencoathup.exampleapp.Networking.Interactors.Memory.WeatherMemoryInteractor;
import com.example.jaerencoathup.exampleapp.Persistence.WeatherData;
import javax.inject.Inject;
import io.reactivex.Single;

/**
 * Created by jaerencoathup on 25/03/2018.
 */

public class WeatherNetworkInteractorImpl implements WeatherNetworkInteractor {

    ApiService apiService;
    WeatherMemoryInteractor memoryInteractor;

    @Inject
    public WeatherNetworkInteractorImpl(ApiService apiService, WeatherMemoryInteractor memoryInteractor) {
        this.apiService = apiService;
        this.memoryInteractor = memoryInteractor;
    }

    @Override
    public Single<WeatherData> getWeatherData(String city) {
        return apiService.getWeather(city)
                .map(WeatherData::copyFromResponse)
                .doOnSuccess(memoryInteractor::saveData);
    }
}
