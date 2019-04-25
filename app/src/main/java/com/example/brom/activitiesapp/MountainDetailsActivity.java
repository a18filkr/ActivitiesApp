package com.example.brom.activitiesapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MountainDetailsActivity extends AppCompatActivity {

    private ImageView mCardImage;
    private TextView mCardTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountaindetails);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mCardImage = findViewById(R.id.cardImage);
        mCardTitle = findViewById(R.id.cardTitle);

        int imageResource = getResources().getIdentifier("@drawable/mountain_top", null, this.getPackageName());
        mCardImage.setImageResource(imageResource);

        mCardTitle.setText("Mountain Pic");


    }

}
