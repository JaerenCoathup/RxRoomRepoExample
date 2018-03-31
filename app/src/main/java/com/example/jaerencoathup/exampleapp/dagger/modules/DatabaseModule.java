package com.example.jaerencoathup.exampleapp.dagger.modules;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.example.jaerencoathup.exampleapp.persistence.WeatherDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jaerencoathup on 21/06/2017.
 */

@Module
public class DatabaseModule {
    @Provides
    @Singleton
    public WeatherDatabase providesDatabase(Context context) {
        WeatherDatabase database = Room.databaseBuilder(context, WeatherDatabase.class, "db")
                .fallbackToDestructiveMigration()
                .build();
        return database;
    }
}
