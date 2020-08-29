package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView ballDisplay;

    private final int[] ballArray = new int[] {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };

    private final View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Random randomNumberGenerator = new Random();
            int bound = ballArray.length;
            int number = randomNumberGenerator.nextInt(bound);
            ballDisplay.setImageResource(ballArray[number]);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ballDisplay = findViewById(R.id.imageView_eightBall);
        Button myButton = findViewById(R.id.askButton);

        myButton.setOnClickListener(clickListener);
    }
}
