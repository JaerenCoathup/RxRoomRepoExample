package com.example.jaerencoathup.exampleapp.persistence.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import com.example.jaerencoathup.exampleapp.persistence.WeatherData;

import io.reactivex.Maybe;

/**
 * Created by jaerencoathup on 30/03/2018.
 */

@Dao
public interface WeatherDao {
    @Query("SELECT * FROM WeatherData WHERE name = :name")
    Maybe<WeatherData> getWeather(String name);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void saveData(WeatherData weatherEntity);
}
