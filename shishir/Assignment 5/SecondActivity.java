package com.shishir.assignment5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView incomingdata = (TextView) findViewById(R.id.textViewd);
        Intent incintent = getIntent();
        String randomg = incintent.getStringExtra("name");
        incomingdata.setText(randomg);
    }
}
