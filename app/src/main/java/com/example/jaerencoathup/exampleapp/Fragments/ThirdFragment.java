package com.example.jaerencoathup.exampleapp.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.jaerencoathup.exampleapp.Dagger.Modules.ThirdModule;
import com.example.jaerencoathup.exampleapp.ExampleApplication;
import com.example.jaerencoathup.exampleapp.Mvp.Third;
import com.example.jaerencoathup.exampleapp.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ThirdFragment extends ExampleFragment<Third.Presenter> implements Third.View {

    @BindView(R.id.list_followers)
    RecyclerView followersList;

    public static Intent buildIntent(Context context) {
        return new Intent(context, ThirdFragment.class);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectDependencies();
        presenter.onCreate();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_followers, container, false);
        ButterKnife.bind(this, view);
        followersList.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }

    private void injectDependencies() {
        ExampleApplication.getApplicationComponent().plus(new ThirdModule(this)).inject(this);
    }

}
