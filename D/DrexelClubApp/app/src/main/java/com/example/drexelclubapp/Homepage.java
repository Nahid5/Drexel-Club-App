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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        GoToNewActivity1 = (Button) findViewById(R.id.cebutton);
        //String username = getIntent().getStringExtra("Username");

        //TextView tv = (TextView)findViewById(R.id.TVlogin);
        //tv.setText(username);

        GoToNewActivity1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent i = new Intent(Homepage.this, ClubDetails.class);
                startActivity(i);

            }
        });
    }
}
