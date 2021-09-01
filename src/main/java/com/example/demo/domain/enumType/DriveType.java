package com.example.demo.domain.enumType;

public enum DriveType {
    AUTONOM(0,12), SELF_DRIVE(1,64), HALF_AUTONOM(2,123);

    private int value;
    private int duration;

    DriveType(int value, int duration) {
        this.value = value;
        this.duration = duration;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
