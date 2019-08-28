package com.zoythree.Profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zoythree.PaymentMethodActivity;
import com.zoythree.R;
import com.zoythree.SetLocation.SetLocationMapActivity;


import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.profile_password_layout_id)
    void changePasswordClick(){
        startActivity(new Intent(ProfileActivity.this,ProfileChangePasswordActivity.class));
    }

    @OnClick(R.id.edit_profile_img)
    void editProfileClick(){
        startActivity(new Intent(ProfileActivity.this,EditProfileActivity.class));
    }

    @OnClick(R.id.profile_address_layout_id)
    void changeAddressClick(){
        Intent intent=new Intent(ProfileActivity.this, SetLocationMapActivity.class);
        intent.putExtra("loc","Change Password");
        startActivity(intent);
    }

    @OnClick(R.id.profile_payment_layout_id)
    void changePaymentMethod(){
        Intent intent=new Intent(ProfileActivity.this, PaymentMethodActivity.class);
        intent.putExtra("payment","");
        startActivity(intent);
    }
}