package com.preusapps.energyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddApplianceActivity extends AppCompatActivity {

    EditText applianceNameInput;
    EditText applianceWattageInput;
    EditText applianceTimeusedInput;
    TextView displayAllAppliances;
    DBHelper dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_appliance);
        applianceNameInput = (EditText) findViewById(R.id.applianceNameInput);
        displayAllAppliances = (TextView) findViewById(R.id.displayAllAppliances);
        dbHandler = new DBHelper(this, null, null, 1);
        printDatabase();
    }

    public void addButtonClicked(View view) {
        //Method Variables!
//        String applianceName = applianceNameInput.getText().toString();
//        int applianceWattage = Integer.parseInt(applianceWattageInput.getText().toString());
//        double applianceTimeused = Double.parseDouble(applianceWattageInput.getText().toString());
        Appliance appliance = new Appliance("test");
        dbHandler.addAppliance(appliance);
        printDatabase();
    }

    public void deleteButtonClicked(View view) {
        String inputText = applianceNameInput.getText().toString();
        dbHandler.deleteAppliance(inputText);
        printDatabase();
    }

    public void printDatabase() {
        String dbString = dbHandler.databaseToString();
        displayAllAppliances.setText(dbString);
        applianceNameInput.setText("");
    }


    public void CloseBtnClicked(View view) {
        Intent i = new Intent(this, ApplianceActivity.class);
        startActivity(i);
    }

}
