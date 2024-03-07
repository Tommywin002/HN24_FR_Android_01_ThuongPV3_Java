package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.Question3;

public abstract class Room {
    private int nightNumber;
    private double totalMoney;

    public Room(int nightNumber, double totalMoney) {
        this.nightNumber = nightNumber;
        this.totalMoney = totalMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Room() {
    }

    public int getNightNumber() {
        return nightNumber;
    }

    public void setNightNumber(int nightNumber) {
        this.nightNumber = nightNumber;
    }


    public abstract void printRoomType();

    public abstract double caculateMonthlyMoney(int nightNumber);
    public abstract double caculateMonthlyMoney(int nightNumber, double serviceFee);
}
