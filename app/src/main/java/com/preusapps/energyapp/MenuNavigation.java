package com.preusapps.energyapp;

import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by jakobwilhjelmpoulsen on 03/05/2016.
 */

public class MenuNavigation extends HomeActivity {

        public void MenuBtnClicked (View view){
        openDrawer();
    }

    public void openDrawer() {
        drawerLayout.openDrawer(Gravity.LEFT);
    }

    public void AddBtnClicked(View view) {
        Intent i = new Intent(this, AddActivity.class);
        startActivity(i);
    }

    public void SummaryMenuClicked() {
        drawerLayout.closeDrawers();
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
    }

    public void HouseMenuClicked() {
        drawerLayout.closeDrawers();
        Intent i = new Intent(this, HouseActivity.class);
        startActivity(i);
    }

    public void CategoryMenuClicked() {
        drawerLayout.closeDrawers();
        Intent i = new Intent(this, CategoryActivity.class);
        startActivity(i);
    }

    public void RoomMenuClicked() {
        drawerLayout.closeDrawers();
        Intent i = new Intent(this, RoomActivity.class);
        startActivity(i);
    }

    public void ApplianceMenuClicked() {
        drawerLayout.closeDrawers();
        Intent i = new Intent(this, ApplianceActivity.class);
        startActivity(i);
    }

    public void SettingsMenuClicked() {
        drawerLayout.closeDrawers();
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }

    public void HelpMenuClicked() {
        Toast toast = Toast.makeText(getApplicationContext(), "Help Clicked", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void ManageMenuClicked() {
        drawerLayout.closeDrawers();
        Intent i = new Intent(this, ManageActivity.class);
        startActivity(i);
    }

    public void AboutMenuClicked() {
        drawerLayout.closeDrawers();
        Intent i = new Intent(this, AboutActivity.class);
        startActivity(i);
    }
}
