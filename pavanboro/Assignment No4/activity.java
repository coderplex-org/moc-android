package com.example.pavanboro.clickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickButton = (Button) findViewById(R.id.clickButton);

        clickButton.setOnClickListener(
                new Button.OnClickListener(){
                    int x = 1;
                    public void onClick(View view){
                        TextView clickedText = (TextView) findViewById(R.id.clickedText);
                        clickedText.setText("You Tapped button"+ " "+ x +" "+"times");
                        x++;
                    }
                }
        );

    }
}
