package com.example.jaerencoathup.exampleapp.persistence;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.jaerencoathup.exampleapp.persistence.dao.WeatherDao;
import com.example.jaerencoathup.exampleapp.persistence.typeconverters.RoomTypeConverters;

/**
 * Created by jaerencoathup on 30/03/2018.
 */

@Database(entities = {WeatherData.class}, version = 1)
@TypeConverters(RoomTypeConverters.class)
public abstract class WeatherDatabase extends RoomDatabase {
    public abstract WeatherDao weatherDao();
}
