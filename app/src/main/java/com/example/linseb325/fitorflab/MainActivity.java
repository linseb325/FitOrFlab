package com.example.linseb325.fitorflab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {


    // Strings to pass as extras
    public static final String EXERCISE_WEIGHTS = "Weight Lifting";
    public static final String EXERCISE_YOGA = "Yoga";
    public static final String EXERCISE_CARDIO = "Cardio";

    // A key name to look up later
    public static final String EXTRA_ITEM_TITLE = "extra.item.title";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Button outlets
        RelativeLayout weightButton = (RelativeLayout) findViewById(R.id.weightLiftingButton);
        RelativeLayout yogaButton = (RelativeLayout) findViewById(R.id.yogaButton);
        RelativeLayout cardioButton = (RelativeLayout) findViewById(R.id.cardioButton);


        // What happens when we tap each button?
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



    private void loadDetailActivity(String selectedExerciseTitle) {
        System.out.println("Selected " + selectedExerciseTitle);

        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, selectedExerciseTitle);
        startActivity(intent);
    }






}
