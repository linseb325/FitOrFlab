package com.example.linseb325.fitorflab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXERCISE_WEIGHTS = "Weight Lifting";
    public static final String EXERCISE_YOGA = "Yoga";
    public static final String EXERCISE_CARDIO = "Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weightButton = (RelativeLayout) findViewById(R.id.weightLiftingButton);
        RelativeLayout yogaButton = (RelativeLayout) findViewById(R.id.yogaButton);
        RelativeLayout cardioButton = (RelativeLayout) findViewById(R.id.cardioButton);

        weightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the weight lifting screen.
                loadDetailActivity(MainActivity.EXERCISE_WEIGHTS);

            }
        });

        yogaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the yoga screen.
                loadDetailActivity(MainActivity.EXERCISE_YOGA);
            }
        });

        cardioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the cardio screen.
                loadDetailActivity(MainActivity.EXERCISE_CARDIO);
            }
        });





    }



    private void loadDetailActivity(String exerciseTitle) {
        System.out.println(exerciseTitle);



    }






}
