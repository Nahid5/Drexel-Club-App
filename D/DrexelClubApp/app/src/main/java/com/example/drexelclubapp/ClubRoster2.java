package com.example.drexelclubapp;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//list of club members
//again hardcoded and gave up on database implementation due to time constraints
public class ClubRoster2 extends AppCompatActivity {

    /**
     DatabaseHelper2 myDB;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_club_roster);

     ListView listView = (ListView) findViewById(R.id.lvroster);
     myDB = new DatabaseHelper2(this);

     //populate an ArrayList<String> from the database and then view it
     ArrayList<String> theList = new ArrayList<>();
     Cursor data = myDB.getMemberContents();
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
        setContentView(R.layout.activity_club_roster2);

        ListView listView = (ListView) findViewById(R.id.lvroster2);

        // Create and populate a List of club events.
        String[] events = new String[] { "Vivienne Ho", "John Tran", "Person3", "Person4",
                "Person5", "Person6", "Person7", "Person8"};
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
    }
}