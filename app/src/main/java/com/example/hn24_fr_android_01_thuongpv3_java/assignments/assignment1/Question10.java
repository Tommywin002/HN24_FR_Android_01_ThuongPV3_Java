package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment1;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        do {
            year = sc.nextInt();
        }
        while (year < 0);
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 != 0)){
            System.out.println("Nam " + year + " la nam nhuan");
        }
        else
            System.out.println("Nam " + year + " khong la nam nhuan");
    }
}
