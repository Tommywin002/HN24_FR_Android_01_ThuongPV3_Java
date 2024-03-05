package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment1;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        int inputNumber;
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        boolean check = true;
        if(inputNumber < 2){
            System.out.println(inputNumber + "khong la so nguyen to");
        }
        else {
            int squareRoot = (int) Math.sqrt(inputNumber);
            for(int i = 2; i <= squareRoot; i++){
                if(inputNumber % i == 0){
                    check = false;
                    break;
                }
            }
            if(check == false){
                System.out.println(inputNumber + " khong la so nguyen to");
            }
            else
                System.out.println(inputNumber + " la so nguyen to");
        }

    }
}
