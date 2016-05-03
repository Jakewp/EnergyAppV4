package com.preusapps.energyapp;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;

public class DBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "EnergyApp_DB.db";
    public static final String TABLE_HOUSES = "houses";
    public static final String TABLE_ROOMS = "rooms";
    public static final String TABLE_CATEGORIES = "categories";
    public static final String TABLE_APPLIANCES = "appliances";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_APPLIANCENAME = "appliancename";
    public static final String COLUMN_WATTAGE = "wattage";
    public static final String COLUMN_TIMEUSED = "timeused";


    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_APPLIANCES + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_APPLIANCENAME + " TEXT, " +
                COLUMN_WATTAGE + " INTEGER, " +
                COLUMN_TIMEUSED + " DOUBLE" +
                ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_APPLIANCES);
        onCreate(db);
    }

    public void addAppliance(Appliance appliance){
        ContentValues values = new ContentValues();
        values.put(COLUMN_APPLIANCENAME, appliance.get_appliancename());
//        values.put(COLUMN_WATTAGE, appliance.get_wattage());
//        values.put(COLUMN_TIMEUSED, appliance.get_timeused());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_APPLIANCES, null, values);
        db.close();
    }

    public void deleteAppliance(String applianceName){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_APPLIANCES + " WHERE " + COLUMN_APPLIANCENAME + "=\"" + applianceName + "\";");
    }

    public String databaseToString(){
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_APPLIANCES + " WHERE 1";

        Cursor c = db.rawQuery(query, null);
        c.moveToFirst();

        while (!c.isAfterLast()) {
            if (c.getString(c.getColumnIndex("appliancename")) != null) {
                dbString += c.getString(c.getColumnIndex("appliancename"));
                dbString += "\n";
            }
            c.moveToNext();
        }
        db.close();
        return dbString;
    }

}
