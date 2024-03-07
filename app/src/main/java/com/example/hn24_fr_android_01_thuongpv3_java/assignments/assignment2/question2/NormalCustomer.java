package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.question2;

public class NormalCustomer extends Customer{
    public double caculateTotalMoney(int productAmount, double productPrice){
        double totalPriceWithoutVAT = productAmount * productPrice;
        return totalPriceWithoutVAT + (totalPriceWithoutVAT * 10 / 100);
    }

    @Override
    public double caculateTotalMoney(int productAmount, double productPrice, int year) {
        return 0;
    }

    @Override
    public void printTotalMoney(String name, double totalMoney) {
        System.out.println("Role: Normal Customer: " + name + " | " + totalMoney);
    }
}
