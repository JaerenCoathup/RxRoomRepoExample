package com.example.jaerencoathup.exampleapp.activities;

/**
 * Created by jaerencoathup on 15/05/2017.
 */

public interface Example {
    interface View {
        void showLoading(boolean show);
        void showError();
        void showMessage(String message);
    }

    interface Presenter {
        void onStop();
    }

}
