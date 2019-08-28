package com.zoythree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SignInActivity extends AppCompatActivity {

@BindView(R.id.signUp_txtV_id) TextView signUpTxtV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.signUp_txtV_id)
    void signUP(){
        Intent intent=new Intent(this,SignUpActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.forget_pass_txtV_id)
    void forgetPassword(){
        Intent intent=new Intent(this,ForgetPasswordActivity.class);
        startActivity(intent);
    }


}
