package com.zoythree.Setting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.LocaleList;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.zoythree.R;
import com.zoythree.utils.PreferenceHelper;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class SettingActivity extends AppCompatActivity {

          String lang_selected;
 @BindView(R.id.language_val_txtV_id) TextView languageValue;
 @BindView(R.id.lang_eng_sideIcon_txtV) TextView arabicSide;
 @BindView(R.id.lang_arb_sideIcon_txtV) TextView englishSide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);

        languageValue.setText(PreferenceHelper.getStringValue(this));
        if(PreferenceHelper.getStringValue(this).equals("ar")){
            arabicSide.setVisibility(View.VISIBLE);
            englishSide.setVisibility(View.GONE);
            languageValue.setText(getString(R.string.arabic));
        }else {
            englishSide.setVisibility(View.VISIBLE);
            languageValue.setText("English");
            arabicSide.setVisibility(View.GONE);
        }

    }

    @OnClick(R.id.lang_layout)
    void changeLanguage(){
      showLanguageDialog();
    }

    private void showLanguageDialog() {
    String [] items={"English","العربية"};
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("Select Language:");
        dialog.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(which==0){
                    lang_selected="en";
                    languageValue.setText(lang_selected);
                    PreferenceHelper.setSomeStringValue(getApplicationContext(),lang_selected);
                    setConfig(lang_selected,SettingActivity.this);

                } else if(which==1){
                    lang_selected="ar";
                    languageValue.setText(lang_selected);
                    PreferenceHelper.setSomeStringValue(SettingActivity.this,lang_selected);
                    setConfig(lang_selected,SettingActivity.this);

                }
                Intent intent=getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName());
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        dialog.show();
        }


    private void setConfig(String language, Context context) {
        Locale locale=new Locale(language);
        Locale.setDefault(locale);
        Configuration configuration=new Configuration();
        configuration.locale=locale;
        context.getResources().updateConfiguration(configuration,context.getResources().getDisplayMetrics());

    }

}