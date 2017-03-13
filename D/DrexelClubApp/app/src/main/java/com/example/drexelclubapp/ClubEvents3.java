package com.example.drexelclubapp;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Event list page.
//Hardcoded, commented out previous implementation of page with database
public class ClubEvents3 extends AppCompatActivity implements AdapterView.OnItemClickListener{
    /**
     DatabaseHelper3 myDB;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_club_events);

     ListView listView = (ListView) findViewById(R.id.lvevents);
     myDB = new DatabaseHelper3(this);

     //populate an ArrayList<String> from the database and then view it
     ArrayList<String> theList = new ArrayList<>();
     Cursor data = myDB.getEventContents();
     if(data.getCount() == 0){
     Toast.makeText(this, "There are no contents in this list!",Toast.LENGTH_LONG).show();
     }else{
     while(data.moveToNext()){
     theList.add(data.getString(1));
     ListAdapter listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,theList);
     listView.setAdapter(listAdapter);
     }
     }


     }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_events3);

        ListView listView = (ListView) findViewById(R.id.lvevents3);

        // Create and populate a List of club events.
        String[] events = new String[] { "Rogue One: A Star Wars Story", "Event2", "Event3", "Event4",
                "Event5", "Event6", "Event7", "Event8"};
        ArrayList<String> eventList = new ArrayList<String>();
        eventList.addAll( Arrays.asList(events) );

        // Create ArrayAdapter using the event list.
        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, eventList);

        // Add more events. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.
        //listAdapter.add( "Ceres" );;

        // Set the ArrayAdapter as the ListView's adapter.
        listView.setAdapter( listAdapter );
        listView.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> l, View view, int position, long id) {
        if(position==0) {
            Intent i = new Intent(ClubEvents3.this, eventdetails2.class);
            startActivity(i);
        }
    }
}
