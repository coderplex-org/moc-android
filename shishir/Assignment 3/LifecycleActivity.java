package com.pavanmallela.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class LifecycleActivity extends AppCompatActivity {

    String status = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        status = "Activity Created";
        displayStatus();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LifecycleActivity.this, LifecycleActivity2.class);
                startActivity(intent);
            }
        });
    }



    @Override
    protected void onStart() {
        //activity resumed
        super.onStart();
        status = "Activity Started";
        displayStatus();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        //restoring instance state
        super.onRestoreInstanceState(savedInstanceState);
        status = "Restoring Instance";
        displayStatus();

    }

    @Override
    protected void onResume() {
        //activity resumed
        super.onResume();
        status = "Activity Resumed";
        displayStatus();
    }

    @Override
    protected void onPause() {
        //activity paused
        super.onPause();
        status = "Activity Paused";
        displayStatus();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        //saving instance state
        super.onSaveInstanceState(outState);
        status = "Saving Instance";
        displayStatus();

    }

    @Override
    protected void onStop() {
        //activity stopped
        super.onStop();
        status = "Activity Stopped";
        displayStatus();
    }

    @Override
    protected void onDestroy() {
        //activity destroyed
        super.onDestroy();
        status = "Activity Destroyed";
        displayStatus();
    }

    @Override
    protected void onRestart() {
        //activity destroyed
        super.onRestart();
        status = "Activity Restarted";
        displayStatus();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lifecycle, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayStatus(){

        String message = "First " + status;
        //t.setText(status);
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
