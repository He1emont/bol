package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override//commit2
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//commit3
        setContentView(R.layout.activity_main);
    }
}