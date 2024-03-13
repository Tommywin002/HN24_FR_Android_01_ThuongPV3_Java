package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment5.question1;

import java.util.Random;

public class Number{
    private int number;

    public Number() {

    }
    public synchronized void printRandomNumber(){
        System.out.println("Random number: ");
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        number = randomNumber;
        notify();
        System.out.println(randomNumber);
    }
    public synchronized void printSquareNumber(){
        double squareNumber;
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Square number: ");
        squareNumber = Math.pow((double) number, 2);
        System.out.println(squareNumber);

    }
}
