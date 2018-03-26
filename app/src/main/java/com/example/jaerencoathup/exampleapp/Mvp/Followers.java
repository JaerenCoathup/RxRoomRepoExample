package com.example.jaerencoathup.exampleapp.Mvp;

import com.example.jaerencoathup.exampleapp.Activities.Example;
import com.example.jaerencoathup.exampleapp.RealmObjects.Follower;
import java.util.List;

/**
 * Created by jaerencoathup on 15/04/2017.
 */

public interface Followers {
    interface View extends Example.View{
        void showFollowers(List<Follower> followers);
    }

    interface Presenter extends Example.Presenter {
        void onCreate();
    }
}
