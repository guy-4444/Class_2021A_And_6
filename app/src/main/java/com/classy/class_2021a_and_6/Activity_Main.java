package com.classy.class_2021a_and_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Activity_Main extends AppCompatActivity {

    public static final String KEY_USER_NAME = "KEY_USER_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // V0
        SharedPreferences prefs = getSharedPreferences("MY_SP", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(KEY_USER_NAME, "Roi");
        editor.apply();
        String name0 = prefs.getString(KEY_USER_NAME, "No name defined");


        // V1
        MySPV1.putString(this, KEY_USER_NAME, "Roi");
        String name1 = MySPV1.getString(this, KEY_USER_NAME, "NA");


        // V2
        MySPV2 mySPV2 = new MySPV2(this);
        mySPV2.putString(KEY_USER_NAME, "Daniel");
        String name2 = mySPV2.getString(KEY_USER_NAME, "NA");


        // V3
        MySPV3.init(this);
        MySPV3.getInstance().putString(MySPV3.KEYS.KEY_USER_USER_NAME, "Daniel");

        MySignal.getInstance().vibrate();
        MySignal.getInstance().toast("JIOL");

    }

}