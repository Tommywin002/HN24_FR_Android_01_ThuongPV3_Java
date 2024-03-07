package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.Question3;

public class BusinessRoom extends Room{

    @Override
    public void printRoomType() {
        System.out.println("Business Room: " + getTotalMoney());
    }

    @Override
    public double caculateMonthlyMoney(int nightNumber) {

        return (double)nightNumber * 300000;
    }

    @Override
    public double caculateMonthlyMoney(int nightNumber, double serviceFee) {
        return 0;
    }

}
