package com.preusapps.energyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AddRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_room);
    }

    public void CloseBtnClicked(View view) {
        Intent i = new Intent(this, RoomActivity.class);
        startActivity(i);
    }

}
