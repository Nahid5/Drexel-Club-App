package com.example.drexelclubapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MyClubs extends AppCompatActivity implements AdapterView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_clubs);


        ListView listView = (ListView) findViewById(R.id.lvclubs2);

        // Create and populate a List of club events.
        String[] events = new String[]{"Campus Activity Board", "MyClub2", "MyClub3"};
        ArrayList<String> eventList = new ArrayList<String>();
        eventList.addAll(Arrays.asList(events));

        // Create ArrayAdapter using the event list.
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, eventList);

        // Add more events. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.
        //listAdapter.add( "Ceres" );;

        // Set the ArrayAdapter as the ListView's adapter.
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> l, View view, int position, long id) {
        Intent intent = new Intent();
        intent.setClass(this, ClubDetails.class);
        intent.putExtra("message", (String) l.getItemAtPosition(position)); //sends which club we selected
        intent.putExtra("position",Integer.toString(position+1));
        startActivity(intent);
    }
}
