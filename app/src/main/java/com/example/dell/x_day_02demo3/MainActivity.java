package com.example.dell.x_day_02demo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initData1();
    }

    private void initData1() {
        Log.e("TAG", "initData1:" );
    }

    private void initData() {

    }
}
