package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment5.question1;

import java.util.Random;

public class Number {
    private int number;

    public Number() {

    }
    public synchronized void printRandomNumber(){
        System.out.print("Random number: ");
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        number = randomNumber;
        System.out.println(randomNumber);
    }
    public synchronized void printSquareNumber(){
        System.out.print("Square number: ");
        double squareNumber = Math.pow((double) number, 2);
        System.out.println(squareNumber);

    }
}
