package com.ryandro.room_persistence_sample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ryandro.room_persistence_sample.database.AppDataBase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    /*    ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.clickHereBtn.setOnClickListener(view ->
                DatabaseInitializer.PopulateDbAsync(AppDataBase.getAppDataBase(this))
        );*/
    }
}
