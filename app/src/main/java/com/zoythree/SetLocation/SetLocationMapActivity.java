package com.zoythree.SetLocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.zoythree.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SetLocationMapActivity extends AppCompatActivity {

    @BindView(R.id.item_name_toolbar) TextView toolbarName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_map_location);
        ButterKnife.bind(this);

        Intent intent=getIntent();
        if(intent.hasExtra("loc")){
            toolbarName.setText(intent.getStringExtra("loc"));
        }else if(intent.hasExtra("address_checkout")){
            toolbarName.setText("Delivery Address");

        }


    }
}
