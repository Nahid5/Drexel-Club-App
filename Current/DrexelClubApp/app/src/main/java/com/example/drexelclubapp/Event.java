package com.example.drexelclubapp;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Dan on 1/26/2017.
 */

public class Event{
    int id, time;
    String title, location, date, about;

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return this.id;
    }

    public void setTime(int time) {this.time = time;}

    public int getTime() {return this.time;}

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getLocation()
    {
        return this.location;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getDate()
    {
        return this.date;
    }

    public void setAbout(String about)
    {
        this.about = about;
    }

    public String getAbout()
    {
        return this.about;
    }
}