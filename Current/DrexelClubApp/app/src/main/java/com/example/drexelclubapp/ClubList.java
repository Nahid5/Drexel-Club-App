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

//list of clubs, hardcoded again
public class ClubList extends AppCompatActivity implements AdapterView.OnItemClickListener{
/**
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_list);

        String[] listContents = {"test1","test2","test3","test4"}; //clubs from db
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, ClubDetails.class);
        intent.putExtra("position", position);
        startActivity(intent);
    }*/

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.content_club_list);

    ListView listView = (ListView) findViewById(R.id.lvclist);

    // Create and populate a List of club events.
    String[] events = new String[]{"Dragons after Dark", "Campus Activity Board", "Club3", "Club4",
            "Club5", "Club6", "Club7", "Club8"};
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

    public void onItemClick(AdapterView<?> l, View view, int position, long id) {
        Intent intent = new Intent();
        intent.setClass(this, ClubDetails.class);
        intent.putExtra("message", (String) l.getItemAtPosition(position)); //sends which club we selected
        intent.putExtra("position",Integer.toString(position));
        startActivity(intent);
    }
}

