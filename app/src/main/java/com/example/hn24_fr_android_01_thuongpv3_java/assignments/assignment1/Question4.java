package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment1;

import android.widget.Switch;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        do {
            month = sc.nextInt();
        }while (month <= 0 || month > 12);
        if(month == 1 || month == 2 || month == 3){
            System.out.println("Quy 1");
        } else if (month == 4 || month == 5 || month == 6) {
            System.out.println("Quy 2");
        } else if (month == 7 || month == 8 || month == 9) {
            System.out.println("Quy 3");
        } else if (month == 10 || month == 11 || month == 12) {
            System.out.println("Quy 4");
        }

    }
}
