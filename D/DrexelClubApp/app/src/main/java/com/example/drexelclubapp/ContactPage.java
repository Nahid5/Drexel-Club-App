package com.example.drexelclubapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

//Page used to display contact information of our developoment team.
public class ContactPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_page);
        TextView tv1 = (TextView)findViewById(R.id.tv1);
        /**String str = ""
                +"            Contact us!             "
                +"/n"
                +"Email: drexeclubapp@gmail.com"
                +"/n"
                +"Email us to add or update clubs and events!"
                +"/n"
                +"Any other inquiries are welcome!";
        tv1.setText(str);
        **/
        String htmltext = ""
                +"<p><h1>Contact us!</h1></p>"
                +"<br>"
                +"Email: <b>drexeclubapp@gmail.com</b>"
                +"<br>"
                +"<br>"
                +"Email us to add or update clubs and events!"
                +"<br>"
                +"<br>"
                +"Any other inquiries are welcome!";
        Spanned sp = Html.fromHtml( htmltext );
        tv1.setText(sp);
    }
}
