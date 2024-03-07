package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float firstNumber, secondNumber;
        try{
            firstNumber = sc.nextFloat();
            secondNumber = sc.nextFloat();
            divided(firstNumber, secondNumber);
        }
        catch (InputMismatchException e){
            System.out.println("Wrong input type");
        }

    }
    public static void divided(float firstNumber, float secondNumber){

        try {
            if(secondNumber == 0.0){
                throw new ArithmeticException("cant divide 0");
            }
            else
                System.out.println("Result: " + (firstNumber/secondNumber));
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("Cant divide 0");
        }
    }
}
