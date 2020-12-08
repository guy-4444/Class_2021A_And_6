package com.classy.class_2021a_and_6;

import android.content.Context;
import android.content.SharedPreferences;

public class MySPV2 {

    private SharedPreferences prefs;

    public MySPV2(Context context) {
        prefs = context.getSharedPreferences("MY_SP", Context.MODE_PRIVATE);
    }

    public void putString(String key, String value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public String getString(String key, String def) {
        return prefs.getString(key, def);
    }

    public void removeKey(String key) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.remove(key).apply();
    }

}
