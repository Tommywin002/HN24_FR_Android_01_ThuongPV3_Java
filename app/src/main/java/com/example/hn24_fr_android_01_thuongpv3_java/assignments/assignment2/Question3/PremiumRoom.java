package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.Question3;

public class PremiumRoom extends Room{
    private double serviceCharge;

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public void printRoomType() {
        System.out.println("Premium Room: " + getTotalMoney());
    }

    @Override
    public double caculateMonthlyMoney(int nightNumber) {
        return 0;
    }

    @Override
    public double caculateMonthlyMoney(int nightNumber, double serviceFee) {
        return ((double)nightNumber * 500000 +  serviceFee) * 105 / 100;
    }
}
