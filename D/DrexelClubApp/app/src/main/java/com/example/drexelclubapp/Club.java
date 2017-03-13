package com.example.drexelclubapp;

import android.support.v7.app.AppCompatActivity;

import java.util.List;

/**
 * Created by Dan on 1/26/2017.
 */

public class Club{
    int id;
    String name, email, admin, about, member;

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return this.id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setAdmin(String uname)
    {
        this.admin = admin;
    }

    public String getAdmin()
    {
        return this.admin;
    }

    public void setAbout(String about)
    {
        this.about = about;
    }

    public String getAbout()
    {
        return this.about;
    }

    public void setMember(String member)
    {
        this.member = member;
    }

    public String getMember()
    {
        return this.member;
    }
}
