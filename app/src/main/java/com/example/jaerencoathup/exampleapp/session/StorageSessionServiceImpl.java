package com.example.jaerencoathup.exampleapp.session;

import android.content.Context;
import android.preference.PreferenceManager;

import javax.inject.Inject;

/**
 * Created by jaerencoathup on 30/03/2018.
 */

public class StorageSessionServiceImpl implements SessionService {

    Context context;

    private static final String LOCATION_KEY = "location";

    @Inject
    public StorageSessionServiceImpl(Context context) {
        this.context = context;
    }

    @Override
    public void saveLocation(String name) {
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putString(LOCATION_KEY, name)
                .apply();
    }

    //If the user hasn't set a location, we just default to London.
    @Override
    public String getLocation() {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getString(LOCATION_KEY, "London");
    }
}
