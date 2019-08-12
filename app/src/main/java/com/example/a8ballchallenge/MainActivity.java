package com.example.a8ballchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView ballDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ballDisplay = findViewById(R.id.image_eightBall);
        final int[] ballArray = new int[]{
                R.drawable.mbaal,
                R.drawable.mbaisiy,
                R.drawable.mbbntyn,
                R.drawable.mbcaaa,
                R.drawable.mbcpn,
                R.drawable.mbdcoi,
                R.drawable.mbiic,
                R.drawable.mbiids,
                R.drawable.mbml,
                R.drawable.mbmrin,
                R.drawable.mbmssn,
                R.drawable.mbog,
                R.drawable.mbonsg,
                R.drawable.mbrhta,
                R.drawable.mbspty,
                R.drawable.mbvd,
                R.drawable.mbwad,
                R.drawable.mby,
                R.drawable.mbyd,
                R.drawable.mbymroi
        };

        Button myButton = findViewById(R.id.askButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Random randomNumber = new Random();
               int number= randomNumber.nextInt(ballArray.length);
               ballDisplay.setImageResource(ballArray[number]);

            }
        });




    }
}
