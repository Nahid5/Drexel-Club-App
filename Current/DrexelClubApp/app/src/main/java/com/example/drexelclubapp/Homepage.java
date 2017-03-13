package com.example.drexelclubapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Homepage extends AppCompatActivity {

    Button GoToNewActivity1;
    Button GoToNewActivity2;
    Button GoToNewActivity3;
    Button GoToNewActivity4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        GoToNewActivity1 = (Button) findViewById(R.id.bhp1); //Clubs
        GoToNewActivity2 = (Button) findViewById(R.id.bhp2); //Events
        GoToNewActivity3 = (Button) findViewById(R.id.bhp3); //My Clubs
        GoToNewActivity4 = (Button) findViewById(R.id.bhp4); //Contact (page)

        GoToNewActivity1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent i = new Intent(Homepage.this, ClubList.class);
                startActivity(i);

            }
        });

        GoToNewActivity2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent i = new Intent(Homepage.this, ClubEvents.class);
                startActivity(i);

            }
        });

        GoToNewActivity3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent i = new Intent(Homepage.this, MyClubs.class);
                startActivity(i);

            }
        });

        GoToNewActivity4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent i = new Intent(Homepage.this, ContactPage.class);
                startActivity(i);

            }
        });
    }
}
