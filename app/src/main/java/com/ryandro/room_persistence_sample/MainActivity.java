package com.ryandro.room_persistence_sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ryandro.room_persistence_sample.database.AppDataBase;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_test = findViewById(R.id.btn_test);
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatabaseInitializer.PopulateDbAsync(AppDataBase.getAppDataBase(MainActivity.this));
            }
        });

//        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        activityMainBinding.clickHereBtn.setOnClickListener(view ->
//                DatabaseInitializer.PopulateDbAsync(AppDataBase.getAppDataBase(this))
//        );
    }
}
