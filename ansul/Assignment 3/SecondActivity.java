package com.android.fcc.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by ansul on 07/06/17.
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        displayToast("Activity 2 onCreate");
        setContentView(R.layout.activity_second);
        Button button=(Button) findViewById(R.id.activity1_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                displayToast("Going back to Activity 1");
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        displayToast("Activity 2 onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        displayToast("Activity 2 onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        displayToast("Activity 2 onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        displayToast("Activity 2 onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        displayToast("Activity 2 onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        displayToast("Activity 2 onRestart");
    }

    private void displayToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
