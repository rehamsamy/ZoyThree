package com.zoythree.SetLocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zoythree.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SetLocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_location);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.setLocationManually_txtV)
    void changeLocation(){
        startActivity(new Intent(SetLocationActivity.this,SetLocationMapActivity.class));
    }
}
