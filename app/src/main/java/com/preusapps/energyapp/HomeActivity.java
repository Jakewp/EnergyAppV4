package com.preusapps.energyapp;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class HomeActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        navigationView = (NavigationView) findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.summary:
                        SummaryMenuClicked();
                        break;
                    case R.id.house:
                        HouseMenuClicked();
                        break;
                    case R.id.category:
                        CategoryMenuClicked();
                        break;
                    case R.id.room:
                        RoomMenuClicked();
                        break;
                    case R.id.appliance:
                        ApplianceMenuClicked();
                        break;
                    case R.id.settings:
                        SettingsMenuClicked();
                        break;
                    case R.id.help:
                        HelpMenuClicked();
                        break;
                    case R.id.manage:
                        ManageMenuClicked();
                        break;
                    case R.id.about:
                        AboutMenuClicked();
                        break;

                }
                return true;
            }
        });
    }

    public void MenuBtnClicked(View view) {
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