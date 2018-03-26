package com.example.jaerencoathup.exampleapp.Mvp;

import com.example.jaerencoathup.exampleapp.Activities.Example;
import com.example.jaerencoathup.exampleapp.RealmObjects.User;

import java.util.List;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

public interface Main {
    interface View extends Example.View{
        void showUser(User user);
    }

    interface Presenter extends Example.Presenter {
        void onCreate();
    }
}
