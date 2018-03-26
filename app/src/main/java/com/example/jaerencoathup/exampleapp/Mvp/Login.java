package com.example.jaerencoathup.exampleapp.Mvp;

import com.example.jaerencoathup.exampleapp.Activities.Example;
import com.example.jaerencoathup.exampleapp.RealmObjects.User;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

public interface Login {
    interface View extends Example.View{
        void showSuccess();
    }

    interface Presenter extends Example.Presenter {
        void login(String username);
    }
}
