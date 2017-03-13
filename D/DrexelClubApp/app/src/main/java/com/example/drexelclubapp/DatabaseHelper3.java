package com.example.drexelclubapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
/**
 * Created by Dan on 1/26/2017.
 */

public class DatabaseHelper3 extends SQLiteOpenHelper {

    //database for club events
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "events.db";
    private static final String TABLE_NAME = "events";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_TITLE = "title";
    private static final String COLUMN_LOCATION = "location";
    private static final String COLUMN_TIME = "time";
    private static final String COLUMN_DATE = "date";
    private static final String COLUMN_ABOUT = "about";
    SQLiteDatabase db;

    private static final String TABLE_CREATE = "create table clubs (id integer primary key not null , " +
            "title text not null , location text not null, time integer not null , date text not null , about text not null);";

    public DatabaseHelper3(Context context)
    {
        super(context , DATABASE_NAME , null , DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    public void insertEvent(Event c)
    {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from contacts";
        Cursor cursor = db.rawQuery(query , null);
        int count = cursor.getCount();

        values.put(COLUMN_ID, count);
        values.put(COLUMN_TITLE , c.getTitle());
        values.put(COLUMN_LOCATION , c.getLocation());
        values.put(COLUMN_TIME , c.getTime());
        values.put(COLUMN_DATE , c.getDate());
        values.put(COLUMN_ABOUT , c.getAbout());

        db.insert(TABLE_NAME , null , values);
        db.close();
    }

    public Cursor getEventContents(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT COLUMN_TITLE FROM " + TABLE_NAME, null);
        return data;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS "+TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }
}
