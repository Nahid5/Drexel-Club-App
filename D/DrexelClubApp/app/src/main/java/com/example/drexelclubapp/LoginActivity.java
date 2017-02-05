package com.example.drexelclubapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void onButtonClick(View v)
    {
        if(v.getId() == R.id.BLogin)
        {
            EditText a = (EditText)findViewById(R.id.TVlogin);
            String str = a.getText().toString();
            EditText b = (EditText)findViewById(R.id.TVpass);
            String pass = b.getText().toString();

            String password = helper.searchPass(str);
            if(pass.equals(password))
            {
                Intent i = new Intent(LoginActivity.this, Homepage.class);
                i.putExtra("Username",str);
                startActivity(i);
            }
            else
            {
                Toast temp = Toast.makeText(LoginActivity.this, "Username and password don't match." , Toast.LENGTH_SHORT);
                temp.show();
            }
        }


    }

    public void click(View v){
        if (v.getId() == R.id.tvRegister){
            if(v.getId() == R.id.tvRegister)
            {
                Intent j = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(j);
            }

        }
    }

}

