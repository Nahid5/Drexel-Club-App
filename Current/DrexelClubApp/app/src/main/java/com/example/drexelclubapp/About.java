package com.example.drexelclubapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;


//about page for a particular club, hardcoded
public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        TextView tv1 = (TextView)findViewById(R.id.tvabout);
        String htmltext = ""
                +"<p><b>The Campus Activities Board (CAB) calendar features over 100 events that engage Cleveland State University (CSU) students in a meaningful and collaborative manor. Our events encourage CSU pride and spirit, and include daily common hour activites, late night festivals, diverse experiences, and campus traditions. </b></p>";
        Spanned sp = Html.fromHtml( htmltext );
        tv1.setText(sp);
    }
}
