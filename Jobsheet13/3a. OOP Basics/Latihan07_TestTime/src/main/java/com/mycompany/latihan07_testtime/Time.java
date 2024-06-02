//Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.latihan07_testtime;

public class Time {
     private int hour;
    private int minute;
    private int second;

    public Time() {
        this(0, 0, 0);  // Set default values
    }

    public Time(int second, int minute, int hour) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("Invalid input. Check hours, minutes, and seconds.");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
