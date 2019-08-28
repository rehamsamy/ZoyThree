package com.zoythree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zoythree.SetLocation.SetLocationMapActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class CheckoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.deliveryAddress_frame_id)
    void deliveryAddressClick(){
        Intent intent=new Intent(CheckoutActivity.this, SetLocationMapActivity.class);
        intent.putExtra("address_checkout","");
        startActivity(intent);
    }

    @OnClick(R.id.paymentMethod_frame_id)
    void paymentMethodClick(){
        Intent intent=new Intent(CheckoutActivity.this,PaymentMethodActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.drlivery_date_frame_id)
    void deliveryDateClick(){
        Intent intent=new Intent(CheckoutActivity.this,DeliveryAdressActivity.class);
        startActivity(intent);
    }
}
