package com.example.jaerencoathup.exampleapp.Fragments;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.ProgressDialog;

import com.example.jaerencoathup.exampleapp.Activities.Example;

import javax.inject.Inject;

/**
 * Created by jaerencoathup on 15/05/2017.
 */

public class ExampleFragment<T extends Example.Presenter> extends android.support.v4.app.Fragment implements Example.View {

    @Inject
    T presenter;

    ProgressDialog progressDialog;
    public void showLoading(boolean show) {

        if (show) {
            if (progressDialog == null) {
                progressDialog = ProgressDialog.show(getActivity(), null, "Loading");
            } else {
                progressDialog.show();
            }

        } else {
            progressDialog.dismiss();
        }

    }

    @Override
    public void showError() {
        AlertDialog dialog = new AlertDialog.Builder(getActivity()).create();
        dialog.setMessage("ERROR");
        dialog.show();
    }

    @Override
    public void showMessage(String message) {
        AlertDialog dialog = new AlertDialog.Builder(getActivity()).create();
        dialog.setMessage(message);
        dialog.show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}
