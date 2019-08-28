package com.zoythree.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceHelper {

    public static final String lang_selected = "language";

    private PreferenceHelper() {
    }

    private static SharedPreferences getSharedPrefenence(Context context) {
        return context.getSharedPreferences("ARP", Context.MODE_PRIVATE);

    }

    public static String getStringValue(Context context) {
        return getSharedPrefenence(context).getString(lang_selected,"en");
    }

    public static void setSomeStringValue(Context context,String newValue){
        SharedPreferences.Editor editor=getSharedPrefenence(context).edit();
        editor.putString(lang_selected,newValue);
        editor.commit();

    }
}