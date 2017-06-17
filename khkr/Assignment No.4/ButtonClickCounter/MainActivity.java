package com.fsemicolon.buttonclickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int i=0;

    TextView counterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterText = (TextView)findViewById(R.id.counter_text);
    }

    public void increment(View view)
    {
        i++;

        String text = "You have tapped the button "+i+ " time";
        counterText.setText(text);

    }
}
