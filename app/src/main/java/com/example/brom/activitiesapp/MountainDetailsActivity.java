package com.example.brom.activitiesapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MountainDetailsActivity extends AppCompatActivity {

    private ImageView mCardImage;
    private TextView mCardTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mCardImage = (ImageView) findViewById(R.id.cardImage);
        mCardTitle = (TextView) findViewById(R.id.cardTitle);

        int imageResource = getResources().getIdentifier("@drawable/mountain_top", null, this.getPackageName());
        mCardImage.setImageResource(imageResource);

        mCardTitle.setText("Mountain Pic");


    }

}
