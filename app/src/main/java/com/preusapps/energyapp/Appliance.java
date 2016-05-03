package com.preusapps.energyapp;

public class Appliance {

    private int _id;
    private String _appliancename;
    private int _wattage;
    private double _timeused;

    public Appliance(){
    }

    public Appliance(String appliancename){
        this._appliancename = appliancename;
    }

    public Appliance(String appliancename, int wattage, double timeused){
        this._appliancename = appliancename;
        this._wattage = wattage;
        this._timeused = timeused;
    }

    public void set_id(int id) {
        this._id = id;
    }

    public void set_appliancename(String appliancename) {
        this._appliancename = appliancename;
    }

    public int get_id() {
        return _id;
    }

    public String get_appliancename() {
        return _appliancename;
    }

    public int get_wattage() {
        return _wattage;
    }

    public void set_wattage(int wattage) {
        this._wattage = wattage;
    }

    public double get_timeused() {
        return _timeused;
    }

    public void set_timeused(double timeused) {
        this._timeused = timeused;
    }
}
