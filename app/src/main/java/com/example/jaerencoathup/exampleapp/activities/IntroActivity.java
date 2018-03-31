package com.example.jaerencoathup.exampleapp.activities;

import com.example.jaerencoathup.exampleapp.R;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class IntroActivity extends ExampleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_continue)
    public void continuePressed() {
        startActivity(MainActivity.buildIntent(this));
    }
}
