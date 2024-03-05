package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment1;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, output = 1;
        do {
            input = sc.nextInt();
        }
        while (input < 0);
        for(int i = input; i > 0; i--){
            output = output * i;
        }
        System.out.println(output);

    }
}
