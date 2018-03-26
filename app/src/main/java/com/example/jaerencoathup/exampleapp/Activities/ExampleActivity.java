package com.example.jaerencoathup.exampleapp.Activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by jaerencoathup on 15/05/2017.
 */

public class ExampleActivity<T extends Example.Presenter> extends AppCompatActivity implements Example.View {

    @Inject
    T presenter;

    ProgressDialog progressDialog;
    public void showLoading(boolean show) {

        if (show) {
            if (progressDialog == null) {
                progressDialog = ProgressDialog.show(this, null, "Loading");
            } else {
                progressDialog.show();
            }

        } else {
            progressDialog.dismiss();
        }

    }

    @Override
    public void showError() {
        AlertDialog dialog = new AlertDialog.Builder(this).create();
        dialog.setMessage("ERROR");
        dialog.show();
    }

    @Override
    public void showMessage(String message) {
        AlertDialog dialog = new AlertDialog.Builder(this).create();
        dialog.setMessage(message);
        dialog.show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}
