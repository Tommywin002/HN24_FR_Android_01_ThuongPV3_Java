package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment3;

public class question3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        try{
            System.out.println(array[6]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds");
        }
    }
}
