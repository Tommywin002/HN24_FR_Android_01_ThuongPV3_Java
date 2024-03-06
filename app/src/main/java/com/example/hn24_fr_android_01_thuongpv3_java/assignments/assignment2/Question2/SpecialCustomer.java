package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.Question2;

public class SpecialCustomer extends Customer{
    public double caculateTotalMoney(int productAmount, double productPrice){
        double totalPriceWithoutVAT = (double)productAmount * productPrice;
        return (totalPriceWithoutVAT * 50/100) + (totalPriceWithoutVAT * 10 / 100);
    }
    @Override
    public void printTotalMoney(String name, double totalMoney) {
        System.out.println("Role: Special Customer: " + name + " | " + totalMoney);
    }
}
