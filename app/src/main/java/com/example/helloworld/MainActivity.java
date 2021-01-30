package com.example.helloworld;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int colorResourceName = getResources().getIdentifier("purple_2001",
                "color", getApplicationContext().getPackageName());
        Toast.makeText(this, "color " + colorResourceName, Toast.LENGTH_LONG).show();
    }
}