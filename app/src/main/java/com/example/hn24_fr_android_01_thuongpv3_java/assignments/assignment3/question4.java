package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment3;

public class question4 {
    public static void main(String[] args) {
        String inputString = "string";
        try {
            int inputNumber = Integer.parseInt(inputString);
        }
        catch (NumberFormatException e) {
            System.out.println("cant convert String to int");
        }
    }
}
