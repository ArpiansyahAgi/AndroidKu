package com.example.arpiansyahagi.ruanglingkup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatRatingBar;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class GoRide5 extends AppCompatActivity {

    private AppCompatRatingBar ratingBar;
    private Button btnRating;
    private TextView tvRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_ride5);
        getSupportActionBar().setTitle("Rating");

        ratingBar = (AppCompatRatingBar) findViewById(R.id.rt_bar);
        btnRating = (Button) findViewById(R.id.bt_submit);
        tvRating = (TextView) findViewById(R.id.tv_rate);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tvRating.setText("Rate :" + rating);
            }
        });
        btnRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GoRide5.this, "Rating" + ratingBar.getRating(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}