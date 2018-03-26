package com.example.jaerencoathup.exampleapp.Dagger.Modules;

import com.example.jaerencoathup.exampleapp.ExampleApplication;
import com.example.jaerencoathup.exampleapp.RealmObjects.User;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by jaerencoathup on 21/06/2017.
 */

@Module
public class DatabaseModule {

    @Provides
    public Realm providesRealm() {
        Realm.init(ExampleApplication.getInstance().getApplicationContext());
        RealmConfiguration config = new RealmConfiguration.Builder().inMemory().build();
        Realm myRealm = Realm.getInstance(config);
        return myRealm;
    }

    @Provides
    public User provideUser(Realm realm) {
        User user = realm.where(User.class).findFirst();
        if (user == null) {
            user = new User();
        }
        return user;
    }
}
