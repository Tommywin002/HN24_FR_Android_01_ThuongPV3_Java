package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment1;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber, sum = 0;
        do {
            inputNumber = sc.nextInt();
        }
        while (inputNumber <= 0);
        for(int i = 1; i < inputNumber; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
