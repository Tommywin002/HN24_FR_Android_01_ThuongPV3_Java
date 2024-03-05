package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment1;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber, outputNumber = 1;
        do {
            inputNumber = sc.nextInt();
        }
        while (inputNumber < 0);
        for(int i = inputNumber; i > 0; i--){
            outputNumber = outputNumber * i;
        }
        System.out.println(outputNumber);

    }
}
