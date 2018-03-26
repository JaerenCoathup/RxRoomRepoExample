package com.example.jaerencoathup.exampleapp.Mvp;

import com.example.jaerencoathup.exampleapp.Activities.Example;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

public interface Second {
    interface View extends Example.View{

    }

    interface Presenter extends Example.Presenter {
        void onCreate();
    }
}
