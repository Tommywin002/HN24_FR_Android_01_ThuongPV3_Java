package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.question1;

public class ManifactureEmployee extends Employee{
    private int maniualSalary;
    private int productNumber;


    public int getManiualSalary() {
        return maniualSalary;
    }

    public void setManiualSalary(int maniualSalary) {
        this.maniualSalary = maniualSalary;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public void printRole(){
        System.out.println("I am a Manifacture Employee");
    }

    @Override
    public int caculateSalary() {
        return maniualSalary + productNumber * 5000;
    }
}
