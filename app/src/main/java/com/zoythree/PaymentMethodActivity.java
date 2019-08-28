package com.zoythree;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PaymentMethodActivity extends AppCompatActivity {

    @BindView(R.id.card_view) CardView cardView;
    @BindView(R.id.cash_delivery_radio_id) RadioButton cashRadio;
    @BindView(R.id.credit_card_radio_id) RadioButton creditRadio;
    @BindView(R.id.credit_card_details_id) TextView creditCardInformation;
    @BindView(R.id.constraint_root) ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);
        ButterKnife.bind(this);

        if(getIntent().hasExtra("payment")){
            creditCardInformation.setVisibility(View.VISIBLE);
            cashRadio.setVisibility(View.GONE);
            creditRadio.setVisibility(View.GONE);


        }
    }

    public void onRadioPaymentClick(View view) {
        int id=view.getId();
        switch (id){
            case R.id.cash_delivery_radio_id :
                cardView.setEnabled(false);
                constraintLayout.setEnabled(false);
                break;
            case R.id.credit_card_radio_id:
                cardView.setEnabled(true);
                break;
                default:
             break;
        }

    }
}
