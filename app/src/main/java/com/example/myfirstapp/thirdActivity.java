package com.example.myfirstapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class thirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        if (getIntent().hasExtra("com.example.myfirstapp.SOMETHING")) {
            TextView tv = (TextView) findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("com.example.myfirstapp.SOMETHING");
            tv.setText(text);
        }

    }
}