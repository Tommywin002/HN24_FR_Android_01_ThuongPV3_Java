package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment5.question3;

import java.util.Random;

public class Data implements Runnable{
    private int total;

    public Data() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public synchronized void addRandomNumberFromNegativeOneHundredToZero(){
        Random random = new Random();
        total = total + random.nextInt(101) - 100;
        System.out.println("Total random number from -100 to 0: " + total);
    }
    public synchronized void addRandomNumberFromZeroToOneHundred(){
        Random random = new Random();
        total = total + random.nextInt(101);
        System.out.println("Total random number from 0 to 100: " + total);
    }

    @Override
    public void run() {

    }
}
