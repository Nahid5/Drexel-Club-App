package com.example.drexelclubapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);
    Button GoToNewActivity1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        GoToNewActivity1 = (Button)findViewById(R.id.bRegister);

        GoToNewActivity1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                EditText name = (EditText) findViewById(R.id.etName);
                EditText uname = (EditText) findViewById(R.id.TVlogin);
                EditText pass1 = (EditText) findViewById(R.id.etPassword);
                EditText pass2 = (EditText) findViewById(R.id.etCPassword);
                EditText email = (EditText) findViewById(R.id.etEmail);

                String namestr = name.getText().toString();
                String unamestr = uname.getText().toString();
                String pass1str = pass1.getText().toString();
                String pass2str = pass2.getText().toString();
                String emailstr = email.getText().toString();

                if (!pass1str.equals(pass2str)) {
                    //popup msg
                    Toast pass = Toast.makeText(RegisterActivity.this, "Passwords don't match!", Toast.LENGTH_SHORT);
                    pass.show();
                }
                else {
                    //insert the details in database
                    Contact c = new Contact();
                    c.setName(namestr);
                    c.setUname(unamestr);
                    c.setPass(pass1str);
                    c.setEmail(emailstr);

                    helper.insertContact(c);
                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
