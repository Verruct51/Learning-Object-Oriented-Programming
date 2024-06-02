//Created By_22343019_Alvin Anugerah Pratama

package com.mycompany.exercise06_testmain5;

public class Date {
      // Private instance variables
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Getters and Setters
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Other methods
    public void setDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // toString() method
    @Override
    public String toString() {
        return "Date[month=" + month + ",day=" + day + ",year=" + year + "]";
    }
}
