package com.example.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Attempts to launch an activity within our own app
        Button secondActivityBtn = (Button)findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntentTwo = new Intent(getApplicationContext(), thirdActivity.class);
                startIntentTwo.putExtra("com.example.myfirstapp.SOMETHING", "HELLO WORLD!");
                startActivity(startIntentTwo);
            }
        });

        // Attempt to launch an activity outside our app
        Button googleBtn = (Button)findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent gotoGoogle = new Intent();
                gotoGoogle.setAction(Intent.ACTION_VIEW);
                gotoGoogle.addCategory(Intent.CATEGORY_BROWSABLE);
                gotoGoogle.setData(Uri.parse("http://www.google.com"));
                startActivity(gotoGoogle);
            }
        });

        // List App button
        Button listAppBtn = (Button)findViewById(R.id.listAppBtn);
        listAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(listIntent);
            }
        });

        // Notes app button
        Button notesBtn = (Button)findViewById(R.id.notesBtn);
        notesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent noteIntent = new Intent(getApplicationContext(), MemoriesActivity.class);
                startActivity(noteIntent);
            }
        });



    }
}