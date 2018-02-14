package com.example.arpiansyahagi.ruanglingkup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView showFolder = (ImageView) findViewById(R.id.go_ride);
        showFolder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,GoRide.class);
                startActivity(intent);
            }
        });

        ImageView showFolder2 = (ImageView) findViewById(R.id.go_ride2);
        showFolder2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,GoRide2.class);
                startActivity(intent);
            }
        });

        ImageView showFolder3 = (ImageView) findViewById(R.id.go_ride3);
        showFolder3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,GoRide3.class);
                startActivity(intent);
            }
        });
        ImageView showFolder4 = (ImageView) findViewById(R.id.go_ride4);
        showFolder4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,GoRide4.class);
                startActivity(intent);
            }
        });
        ImageView showFolder5 = (ImageView) findViewById(R.id.go_ride5);
        showFolder5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,GoRide5.class);
                startActivity(intent);
            }
        });
    }

    public void goRide(View view) {
    }

    public void goRide2(View view) {
    }

    public void goRide3(View view) {
    }

    public void goRide4(View view) {

    }

    public void goRide5(View view) {
    }
}