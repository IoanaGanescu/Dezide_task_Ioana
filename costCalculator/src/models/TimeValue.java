package models;

public class TimeValue {

    private int minutes;
    private float hours;

    public TimeValue(int minutes){
        this.minutes = minutes;
        this.hours = minutes/60F;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }
}
