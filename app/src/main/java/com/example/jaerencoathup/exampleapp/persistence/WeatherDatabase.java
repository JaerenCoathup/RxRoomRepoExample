package com.example.jaerencoathup.exampleapp.persistence;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

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
