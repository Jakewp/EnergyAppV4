package com.preusapps.energyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by jakobwilhjelmpoulsen on 03/05/2016.
 */

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        Thread myThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(5000);
                    Intent startApplication = new Intent(getApplicationContext(), MenuActivity.class);
                    startActivity(startApplication);
                    finish();
                } catch (InterruptedException e) {
                    Toast.makeText(Splash.this, "Error Loading Application", Toast.LENGTH_SHORT).show();
                }
            }
        };
        myThread.start();
    }
}
