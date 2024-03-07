package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.question2;

public abstract class Customer {
    private String name;
    private double paymentMoney;
    private int productAmount;
    private double productPrice;

    public Customer(String name, double paymentMoney, int productAmount, double productPrice) {
        this.name = name;
        this.paymentMoney = paymentMoney;
        this.productAmount = productAmount;
        this.productPrice = productPrice;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(double paymentMoney) {
        this.paymentMoney = paymentMoney;
    }
    public abstract double caculateTotalMoney( int productAmount, double productPrice);

    public abstract double caculateTotalMoney(int productAmount, double productPrice, int year);

    public abstract void printTotalMoney(String name, double totalMoney);

    public Customer() {
    }
}
