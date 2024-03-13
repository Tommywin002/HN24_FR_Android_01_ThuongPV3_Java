package com.example.hn24_fr_android_01_thuongpv3_java.finaltest.question1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int inputNumber = 0;
        //input number
        Scanner sc = new Scanner(System.in);
        boolean inputNumberChecked = false;
        System.out.println("input number: ");
        while (inputNumberChecked == false){
            if(sc.hasNextInt()){
                inputNumber = sc.nextInt();
                inputNumberChecked = true;
            }
            else {
                System.out.println("input again");
                sc.nextLine();
            }
        }
        printSumOfCharInNumber(inputNumber);
        System.out.println("");
        printPrimeNumberTimeEqualNumber(inputNumber);
        System.out.println("");
        printDivisorOfNumber(inputNumber);
        System.out.println("");
        printPrimeDivisorOfNumber(inputNumber);
        System.out.println("");
    }

    public static void printSumOfCharInNumber(int number){
        //sum of char in number
        System.out.println("Sum: ");
        int sum = 0;
        int charNumber = 0;
        while (number > 0){
            charNumber = number % 10;
            sum += charNumber;
            number /= 10;
        }
        System.out.print(sum);
    }
    public static void printPrimeNumberTimeEqualNumber(int number){
        int multi = 0;
        System.out.println("Multiplication: ");
        if(checkPrimeNumber(number) == true){
            System.out.println("Cant make a multiplication of prime number");
        }
        else {
            do{
                for(int i = 2; i <= number; i++){
                    if(checkPrimeNumber(i) == true){
                        if(number % i == 0){
                            number = number / i;
                            System.out.print(i + " ");
                            break;
                        }
                    }
                }
            }
            while(number != 1);
        }
    }
    public static void printDivisorOfNumber(int number){
        //divisor of number
        System.out.println("Divisor of number: ");
        for(int i = 0; i < number; i++){
            int num = number % (i + 1);
            if(num == 0){
                System.out.print(i + 1  + " ");
            }
        }
    }
    public static void printPrimeDivisorOfNumber(int number){
        System.out.println("Prime divisor of number: ");
        for(int i = 0; i < number; i++){
            int num = number % (i + 1);
            if(num == 0){
                if(checkPrimeNumber(i+1) == true){
                    System.out.print(i + 1  + " ");
                }
            }
        }
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
