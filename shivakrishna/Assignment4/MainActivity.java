package com.example.shiva.countmyclicks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b,r;
    TextView tv1, tv2;
    int count=0;
    String txt ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button)findViewById(R.id.button);
        r = (Button)findViewById(R.id.button2);
        tv1 = (TextView)findViewById(R.id.tv1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 txt = tv1.getText().toString();
                 count = Integer.parseInt(txt);
                count++;
                tv1.setText(String.valueOf(count));
            }

        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(String.valueOf("0"));
                String msg = new String("Counter is reset to 0");
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();


            }
        });
    }
}


/*
strings.xml
<resources>
<string name="app_name">CountMyClicks</string>
<string name="zero">0</string>
<string name="click">CLICK</string>
<string name="reset">RESET</string>
</resources>
*/

