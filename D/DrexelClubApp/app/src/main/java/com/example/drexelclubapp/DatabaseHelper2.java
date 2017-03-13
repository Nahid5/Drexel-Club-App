package com.example.drexelclubapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by Dan on 1/26/2017.
 */

public class DatabaseHelper2 extends SQLiteOpenHelper {

    //database for clubs
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "clubs.db";
    private static final String TABLE_NAME = "clubs";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_ADMIN = "admin";
    private static final String COLUMN_ABOUT = "about";
    private static final String COLUMN_MEMBERS = "members";

    SQLiteDatabase db;

    private static final String TABLE_CREATE = "create table clubs (id integer primary key not null , " +
            "name text , email text , admin text , about text , members text);";


    public DatabaseHelper2(Context context)
    {
        super(context , DATABASE_NAME , null , DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    public void insertClub(Club c)
    {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from clubs";
        Cursor cursor = db.rawQuery(query , null);
        int count = cursor.getCount();

        values.put(COLUMN_ID, count);
        values.put(COLUMN_NAME , c.getName());
        values.put(COLUMN_EMAIL , c.getEmail());
        values.put(COLUMN_ADMIN , c.getAdmin());
        values.put(COLUMN_ABOUT , c.getAbout());
        values.put(COLUMN_MEMBERS , c.getMember());


        db.insert(TABLE_NAME , null , values);
        db.close();
    }

    public void insertMember(Club c)
    {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from clubs";
        Cursor cursor = db.rawQuery(query , null);

        values.put(COLUMN_MEMBERS , c.getMember());

        db.insert(TABLE_NAME , null , values);
        db.close();
    }

    public Cursor getMemberContents(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT COLUMN_MEMBERS FROM " + TABLE_NAME, null);
        return data;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS "+TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }
}
