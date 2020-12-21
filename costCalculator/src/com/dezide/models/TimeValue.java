package com.dezide.models;

// TimeValue class - we get minutes in console which are automatically converted in hours
// to make the calculation of timeFactor easier
public class TimeValue {

    private float minutes;
    private float hours;

    //constructor
    public TimeValue(float minutes){
        this.minutes = minutes;
        this.hours = minutes/60F;
    }

    //getters and setters
    public float getMinutes() {
        return minutes;
    }

    public void setMinutes(float minutes) {
        this.minutes = minutes;
        this.hours = minutes/60f;
    }

    public float getHours() {
        return hours;
    }

}
