package com.example.jaerencoathup.exampleapp.repositories.weather;

import com.example.jaerencoathup.exampleapp.persistence.ForecastEntity;
import io.reactivex.Observable;

/**
 * Created by jaerencoathup on 03/11/2017.
 */

public interface WeatherRepository {
    Observable<ForecastEntity> getForecastData();
}
