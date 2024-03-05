package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment1;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber, secondNumber;
        firstNumber = sc.nextInt();
        secondNumber = sc.nextInt();
        while (firstNumber != secondNumber){
            if(firstNumber > secondNumber)
                firstNumber = firstNumber - secondNumber;
            else
                secondNumber = secondNumber - firstNumber;
        }
        System.out.println("UCLN: " + firstNumber);


    }
}
