package com.example.spidert_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    TextView showValue;
    int counter = 0,output;
    Random r;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showValue = (TextView) findViewById(R.id.textView);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        layout = findViewById(R.id.layout);
        r = new Random();

        output = r.nextInt(100);
        showValue.setText("" + output);

    }

    public void count1 (View view)
    {
        counter++;
        if (counter == output)
            layout.setBackgroundColor(Color.RED);
        else
            layout.setBackgroundColor(Color.WHITE);
    }

    public void count2 (View v2)
    {
        counter = counter+2;
        if (counter == output)
            layout.setBackgroundColor(Color.RED);
        else
            layout.setBackgroundColor(Color.WHITE);
    }

    public void count3 (View v3)
    {
        counter = counter+5;
        if (counter == output)
            layout.setBackgroundColor(Color.RED);
        else
            layout.setBackgroundColor(Color.WHITE);
    }

    public void count4 (View v4)
    {
        counter = counter+10;
        if (counter == output)
            layout.setBackgroundColor(Color.RED);
        else
            layout.setBackgroundColor(Color.WHITE);
    }

    public void reset (View view)
    {
        counter = 0;
        showValue.setText(String.valueOf(counter));
        layout.setBackgroundColor(Color.WHITE);
    }


}
