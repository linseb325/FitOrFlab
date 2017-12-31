package com.example.linseb325.fitorflab;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    // Fields for outlets
    TextView exerciseText;
    ImageView exerciseImage;
    LinearLayout mainBG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Setting outlets
        this.exerciseText = (TextView) findViewById(R.id.exerciseTitleTextView);
        this.exerciseImage = (ImageView) findViewById(R.id.imageView);
        this.mainBG = (LinearLayout) findViewById(R.id.mainBackgroundLayout);

        // Set the title text.
        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        this.exerciseText.setText(exerciseTitle);

        // Set the color and image based on which exercise was selected.
        if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)) {
            // Chose weight lifting. Update UI.
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));
        } else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)) {
            // Chose yoga. Update UI.
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplication().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#916bcd"));
        } else {
            // Chose cardio. Update UI.
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplication().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#52ad56"));
        }




    }





}
