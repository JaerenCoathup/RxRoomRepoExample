package com.example.jaerencoathup.exampleapp.Networking.Repositories.Forecast;

import com.example.jaerencoathup.exampleapp.Persistence.WeatherData;
import io.reactivex.Observable;

/**
 * Created by jaerencoathup on 03/11/2017.
 */

public interface WeatherRepository {
    public Observable<WeatherData> getForecastData(String city);
}
