package com.example.jaerencoathup.exampleapp.persistence.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import com.example.jaerencoathup.exampleapp.persistence.ForecastEntity;
import io.reactivex.Maybe;

/**
 * Created by jaerencoathup on 30/03/2018.
 */

@Dao
public interface WeatherDao {
    @Query("SELECT * FROM ForecastEntity WHERE name = :name")
    Maybe<ForecastEntity> getWeather(String name);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void saveData(ForecastEntity weatherEntity);
}
