package com.example.drexelclubapp;

import android.app.LocalActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TabHost;
import android.app.TabActivity;
import android.widget.TabHost.TabSpec;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import static com.example.drexelclubapp.R.id.tabhost;
import static com.example.drexelclubapp.R.id.tvclubname;

public class ClubDetails extends AppCompatActivity {



    TabHost TabHostWindow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_details);
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");
        String position = bundle.getString("position");
        TextView tv1 = (TextView)findViewById(R.id.tvclubname);
        tv1.setText(message);
        TabHost TabHostWindow = (TabHost)findViewById(R.id.tabhost);
        LocalActivityManager mLocalActivityManager = new LocalActivityManager(this, false);
        mLocalActivityManager.dispatchCreate(savedInstanceState); // state will be bundle your activity state which you get in onCreate
        TabHostWindow.setup(mLocalActivityManager);
        //TabHostWindow.addTab(TabHostWindow.newTabSpec("clientii").setIndicator(
        //        "TAB clienti").setContent(new Intent(this,ListClientiTab.class)));


        TabSpec tab1 = TabHostWindow.newTabSpec("First Tab");
        TabSpec tab2 = TabHostWindow.newTabSpec("Second Tab");
        TabSpec tab3 = TabHostWindow.newTabSpec("Third tab");

        // Set the Tab name and Activity
        // that will be opened when particular Tab will be selected
        if(position.equals("0")) {
            tab1.setIndicator("About");
            tab1.setContent(new Intent(this, About2.class));
        }

        if(position.equals("1")) {
            tab1.setIndicator("About");
            tab1.setContent(new Intent(this, About.class));
        }
        if(position.equals("0")) {
            tab2.setIndicator("Events");
            tab2.setContent(new Intent(this, ClubEvents2.class));
        }

        if(position.equals("1")) {
            tab2.setIndicator("Events");
            tab2.setContent(new Intent(this, ClubEvents3.class));
        }

        if(position.equals("0")) {
            tab3.setIndicator("Members");
            tab3.setContent(new Intent(this, ClubRoster.class));
        }

        if(position.equals("1")) {
            tab3.setIndicator("Members");
            tab3.setContent(new Intent(this, ClubRoster2.class));
        }


        TabHostWindow.addTab(tab1);
        TabHostWindow.addTab(tab2);
        TabHostWindow.addTab(tab3);
        }


}



