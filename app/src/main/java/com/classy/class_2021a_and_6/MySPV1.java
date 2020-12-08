package com.classy.class_2021a_and_6;

import android.content.Context;
import android.content.SharedPreferences;

public class MySPV1 {

    public static void putString(Context context, String key, String value) {
        SharedPreferences prefs = context.getSharedPreferences("MY_SP", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getString(Context context, String key, String def) {
        SharedPreferences prefs = context.getSharedPreferences("MY_SP", Context.MODE_PRIVATE);
        return prefs.getString(key, def);
    }

    public static void removeKey(Context context, String key) {
        SharedPreferences prefs = context.getSharedPreferences("MY_SP", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.remove(key).apply();
    }

}
