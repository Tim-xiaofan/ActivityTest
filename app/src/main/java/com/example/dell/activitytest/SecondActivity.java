package com.example.dell.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String data="Test";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //Intent intent=getIntent();
        //data=intent.getStringExtra("extra_data");
       // Log.d("SecondActivity", "Test");
    }
}
