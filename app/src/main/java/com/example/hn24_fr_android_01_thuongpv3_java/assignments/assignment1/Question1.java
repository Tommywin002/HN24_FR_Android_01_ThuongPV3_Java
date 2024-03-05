package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int averageScore;
        do{
            averageScore = sc.nextInt();
        }while (averageScore < 0 || averageScore > 10);
        if(averageScore >= 5)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
