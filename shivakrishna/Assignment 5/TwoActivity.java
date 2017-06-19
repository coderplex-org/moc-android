package com.example.shiva.countinfrench;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        TextView tv = (TextView)findViewById(R.id.tv);
        Intent f = getIntent();
        String get = f.getStringExtra("item");
            tv.setText(get);
    }
}