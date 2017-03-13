package com.example.drexelclubapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;


//event details for a particular event, hardcoded
public class eventdetails2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventdetails2);
        TextView tv1 = (TextView)findViewById(R.id.tveventd2);
        String htmltext = ""
                +"<p><h1>Rogue One: A Star Wars Story</h1></p>"
                +"<br>"
                +"Who: Campus Activities Board</b>"
                +"<br>"
                +"<br>"
                +"What: FREE showing of Rogue One: A Star Wars Story!"
                +"<br>"
                +"<br>"
                +"Where: Perelman Amphitheater"
                +"<br>"
                +"<br>"
                +"When: Thursday, March 16 @ 8PM-11PM"
                +"<br>"
                +"<br>"
                +"Contact: Campus Activity Board cab@drexel.edu";

        Spanned sp = Html.fromHtml( htmltext );
        tv1.setText(sp);
    }
}
