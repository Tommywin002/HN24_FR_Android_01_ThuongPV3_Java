package com.example.hn24_fr_android_01_thuongpv3_java.finaltest.question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> integerList = new ArrayList<>();
    public static void main(String[] args) {
        int number1 = 77377;
        int number2 = 3223223;
        int number3 = 7900301;
        int number4 = 9991999;
        int number5 = 100000;
        int number6 = 100001;
        integerList.add(number1);
        integerList.add(number2);
        integerList.add(number3);
        integerList.add(number4);
        integerList.add(number5);
        integerList.add(number6);
        //number input
        System.out.println("List number: ");
        for(int i = 0; i < integerList.size(); i++){
            System.out.print(integerList.get(i) + " ");
        }
        System.out.println("");
        //question a
        System.out.println("Answer a is prime number: ");
        for(int i = 0; i < integerList.size(); i++){
            if(checkPrimeNumber(integerList.get(i)) == true){
                System.out.print(integerList.get(i) + " ");
            }
        }
        System.out.println("");
        //question b
        System.out.println("Answer b is palindrome number: ");
        for(int i = 0; i < integerList.size(); i++){
            if(checkPalinDromeNumber(integerList.get(i)) == true){
                System.out.print(integerList.get(i) + " ");
            }
        }
        System.out.println("");
        //question c
        System.out.println("Answer c is all number in the number is prime number");
        for(int i = 0; i < integerList.size(); i++){
            if(checkDivisorOfCharInNumber(integerList.get(i)) == true){
                System.out.print(integerList.get(i) + " ");
            }
        }
        System.out.println("");
        //question d
        System.out.println("Answer d is sum of number in the number is prime number ");
        for(int i = 0; i < integerList.size(); i++){
            if(checkCharSumDivisorOfNumber(integerList.get(i)) == true){
                System.out.print(integerList.get(i) + " ");
            }
        }
        System.out.println("");
    }
    public static boolean checkPalinDromeNumber(int number){
        List<Integer> charNumberList = new ArrayList<>();
        int charNumber = 0;
        while (number > 0){
            charNumber = number % 10;
            charNumberList.add(charNumber);
            number /= 10;
        }
        List<Integer> reverseCharNumberList = new ArrayList<>();
        for(int i = charNumberList.size() - 1; i >= 0; i--){
            reverseCharNumberList.add(charNumberList.get(i));
        }
        for(int i = 0; i < charNumberList.size(); i++){
            if(charNumberList.get(i) != reverseCharNumberList.get(i)) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkCharSumDivisorOfNumber(int number){
        int checkCharSum = printSumOfCharInNumber(number);
        if(checkPrimeNumber(checkCharSum) == false){
            return false;
        }
        return true;
    }
    public static int printSumOfCharInNumber(int number){
        //sum of char in number
        int sum = 0;
        int charNumber = 0;
        while (number > 0){
            charNumber = number % 10;
            sum += charNumber;
            number /= 10;
        }
        return sum;
    }
    public static boolean checkDivisorOfCharInNumber(int number){
        List<Integer> charNumberList = new ArrayList<>();
        int charNumber = 0;
        while (number > 0){
            charNumber = number % 10;
            charNumberList.add(charNumber);
            number /= 10;
        }
        for(Integer i: charNumberList){
            if(checkPrimeNumber(i) == false){
                return false;
            }
        }
        return true;
    }
    public static boolean checkPrimeNumber(int number){
        if(number < 2){
            return false;
        }
        else {
            int squareRoot = (int) Math.sqrt(number);
            for(int i = 2; i <= squareRoot; i++){
                if(number % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
