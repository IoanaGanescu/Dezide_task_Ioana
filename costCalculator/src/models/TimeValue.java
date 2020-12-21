package models;

public class TimeValue {

    private float minutes;
    private float hours;

    public TimeValue(float minutes){
        this.minutes = minutes;
        this.hours = minutes/60F;
    }

    public float getMinutes() {
        return minutes;
    }

    public void setMinutes(float minutes) {
        this.minutes = minutes;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }
}
