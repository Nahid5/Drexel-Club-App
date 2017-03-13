package com.example.drexelclubapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;


//about page for a particular club, hardcoded
public class About2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about2);
        TextView tv1 = (TextView)findViewById(R.id.tvabout2);
        String htmltext = ""
                +"<p><b>Dragons After Dark (DAD) is an effort funded by SAFAC to provide exciting evening programs and activities on Drexel University’s campus throughout the term.</b></p>";
        Spanned sp = Html.fromHtml( htmltext );
        tv1.setText(sp);
    }
}
