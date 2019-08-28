package com.zoythree.ContactUs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zoythree.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ContactUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.send_message_btn)
    void sendMessageClick(){
        startActivity(new Intent(ContactUsActivity.this,ContactUsSendMessActivity.class));
    }
}
