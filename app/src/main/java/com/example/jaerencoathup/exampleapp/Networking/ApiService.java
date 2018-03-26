package com.example.jaerencoathup.exampleapp.Networking;

import com.example.jaerencoathup.exampleapp.Networking.Models.CityForecastResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by jaerencoathup on 05/05/2017.
 */

public interface ApiService {
    @GET("/weather")
    Observable<CityForecastResponse> getUser(@Query("q") String city);
}
