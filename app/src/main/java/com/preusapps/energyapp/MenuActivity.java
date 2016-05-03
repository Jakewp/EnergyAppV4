package com.preusapps.energyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void MenuHomeClicked(View view) {
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
    }
    public void MenuHouseClicked(View view) {
        Intent i = new Intent(this, HouseActivity.class);
        startActivity(i);
    }
    public void MenuRoomClicked(View view) {
        Intent i = new Intent(this, RoomActivity.class);
        startActivity(i);
    }
    public void MenuCategoryClicked(View view) {
        Intent i = new Intent(this, CategoryActivity.class);
        startActivity(i);
    }
    public void MenuApplianceClicked(View view) {
        Intent i = new Intent(this, ApplianceActivity.class);
        startActivity(i);
    }
    public void MenuSettingsClicked(View view) {
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }
    public void MenuAboutClicked(View view) {
        Intent i = new Intent(this, AboutActivity.class);
        startActivity(i);
    }
    public void CloseBtnClicked(View view) {
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
    }

}
