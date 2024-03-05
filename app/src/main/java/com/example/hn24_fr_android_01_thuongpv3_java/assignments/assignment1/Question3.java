package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        String symble;
        do{
            symble = sc.next();
        }
        while (symble.equals("+") != true && symble.equals("-") != true && symble.equals("*") != true && symble.equals("/") != true);



        switch (symble){
            case "+":
                System.out.println("a + b = " + (a + b));
                break;
            case "-":
                System.out.println("a - b = " + (a - b));
                break;
            case "*":
                System.out.println("a * b = " + (a * b));
                break;
            case "/":
                System.out.println("a / b = " + (a / b));
                break;

        }




    }
}
