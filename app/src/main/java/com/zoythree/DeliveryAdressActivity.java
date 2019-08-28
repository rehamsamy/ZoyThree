package com.zoythree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TimePicker;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DeliveryAdressActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_adress);
        ButterKnife.bind(this);

    }
}
