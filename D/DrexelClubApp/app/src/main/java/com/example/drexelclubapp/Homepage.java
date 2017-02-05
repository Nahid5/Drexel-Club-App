package com.example.drexelclubapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        String username = getIntent().getStringExtra("Username");

        TextView tv = (TextView)findViewById(R.id.TVlogin);
        tv.setText(username);
    }
}
