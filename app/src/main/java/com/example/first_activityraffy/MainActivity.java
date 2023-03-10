package com.example.first_activityraffy;

import androidx.appcompat.app.AppCompatActivity;

import android.R.color;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nme1;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nme1 = (TextView) findViewById(R.id.Intro);
        nme1.setTextColor(color.white);
    }
}