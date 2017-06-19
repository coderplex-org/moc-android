package com.android.fcc.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.pavanmallela.fccassignments.R;
import com.pavanmallela.fccassignments.SecondActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        displayToast("Activity 1 onCreate");
        setContentView(R.layout.activity_main);

                Button button = (Button) findViewById(R.id.activity2_button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        displayToast("Going to activity 2");
                        startActivity(intent);
                    }
                });
            }

            @Override
            protected void onStart() {
                super.onStart();
                displayToast("Activity 1 onStart");
            }

            @Override
            protected void onPause() {
                super.onPause();
                displayToast("Activity 1 onPause");
            }

            @Override
            protected void onResume() {
                super.onResume();
                displayToast("Activity 1 onResume");
            }

            @Override
            protected void onStop() {
                super.onStop();
                displayToast("Activity 1 onStop");
            }

            @Override
            protected void onRestart() {
                super.onRestart();
                displayToast("Activity 1 onRestart");
            }

            @Override
            protected void onDestroy() {
                super.onDestroy();
                displayToast("Activity 1 onDestroy");
            }


            private void displayToast(String msg){
                    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
                }
            }
