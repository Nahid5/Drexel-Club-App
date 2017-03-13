package com.example.drexelclubapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;


//event details for a particular event, hardcoded
public class eventdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventdetails);
        TextView tv1 = (TextView)findViewById(R.id.tveventd);
        String htmltext = ""
                +"<p><h1>Dragons After Dark Bingo Night</h1></p>"
                +"<br>"
                +"Who: Dragons After Dark</b>"
                +"<br>"
                +"<br>"
                +"What: Trivia and Bingo!"
                +"<br>"
                +"<br>"
                +"Where: Rec Center Lobby"
                +"<br>"
                +"<br>"
                +"When: Thursday, March 9 @ 9PM-11PM"
                +"<br>"
                +"<br>"
                +"Contact: Caitlyn Beisley cmb596@drexel.edu";

        Spanned sp = Html.fromHtml( htmltext );
        tv1.setText(sp);
    }
}
