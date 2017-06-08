package com.example.shiva.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String message = "";
    int actionCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "You just clicked a snackbar floating action button", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
                /*.setAction("RETURN", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                                startActivity(intent);
                                Snackbar.make(v,"Restored Activity",Snackbar.LENGTH_LONG);
                            }
                        }).show();*/
            }
        });
        message = "Activity Created";
        displayMessage();

    }

    @Override
    protected void onPause(){
        super.onPause();
        message = "Executing onPause()";
        displayMessage();
    }

    @Override
    protected void onStart() {
        super.onStart();
        message="Executing onStart()";
        displayMessage();
    }



    @Override
    protected void onStop() {
        super.onStop();
        message="Executing onStop()";
        displayMessage();
    }

    @Override
    protected void onResume() {
        super.onResume();
        message="Executing onResume()";
        displayMessage();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        message = "Executing onDestroy()";
        displayMessage();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        message="Executing onRestart()";
        displayMessage();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void displayMessage(){
        actionCount++;
        String status = String.valueOf(actionCount)+ ": "+ message;
        Toast.makeText(getApplicationContext(),status,Toast.LENGTH_SHORT).show();
    }

}

