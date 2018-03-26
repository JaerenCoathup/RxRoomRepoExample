package com.example.jaerencoathup.exampleapp.Networking.Repositories.Forecast;

import com.example.jaerencoathup.exampleapp.Persistence.ForecastData;
import io.reactivex.Observable;

/**
 * Created by jaerencoathup on 03/11/2017.
 */

public interface WeatherRepository {
    public Observable<ForecastData> getForecastData();
}
