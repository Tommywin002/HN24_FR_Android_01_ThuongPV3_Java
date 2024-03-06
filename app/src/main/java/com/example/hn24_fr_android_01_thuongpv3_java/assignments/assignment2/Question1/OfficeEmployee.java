package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.Question1;

public class OfficeEmployee extends Employee{
    private int hourNumber;

    public OfficeEmployee() {
        super();

    }

    public int getHourNumber() {
        return hourNumber;
    }

    public void setHourNumber(int hourNumber) {
        this.hourNumber = hourNumber;
    }

    public void printRole(){
        System.out.println("I am a Office Employee");
    }
    @Override
    public int caculateSalary() {
        return hourNumber * 100000;
    }
}
