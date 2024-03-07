package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.question2;

public class CloseCustomer extends Customer{
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public double caculateTotalMoney(int productAmount, double productPrice) {
        return 0;
    }

    @Override
    public double caculateTotalMoney(int productAmount, double productPrice, int year) {
        double totalPriceWithoutVAT = productAmount * productPrice;
        double min = (double)year * 5 / 100;
        if(min > 50)
            min = 50;
        return totalPriceWithoutVAT * min / 100 + (totalPriceWithoutVAT * 10 / 100);
    }

    @Override
    public void printTotalMoney(String name, double totalMoney) {
        System.out.println("Role: Close Customer: " + name + " | " + totalMoney);

    }
}
