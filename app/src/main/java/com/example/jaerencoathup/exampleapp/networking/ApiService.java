package com.example.jaerencoathup.exampleapp.networking;

import com.example.jaerencoathup.exampleapp.networking.models.CityForecastResponse;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by jaerencoathup on 05/05/2017.
 */

//http://api.openweathermap.org/data/2.5/
public interface ApiService {
    @GET("weather")
    Single<CityForecastResponse> getWeather(@Query("q") String city);
}
