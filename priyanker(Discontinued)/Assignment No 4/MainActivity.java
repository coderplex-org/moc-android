package com.example.android.countingbuttonclick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int freqCount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickMe(View view)
    {
        freqCount++;
        display("You tapped the button "+freqCount+" times");
    }
    private void display(String number) {
        TextView quantityTextView = (TextView) findViewById(R.id.countText);
        quantityTextView.setText("" + number);
    }
}
