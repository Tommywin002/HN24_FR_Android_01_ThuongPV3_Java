package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment3;

public class Question5 {
    public static void main(String[] args) {
        String[] inputString = null;
        try {
            System.out.println(inputString[3]);
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
}
