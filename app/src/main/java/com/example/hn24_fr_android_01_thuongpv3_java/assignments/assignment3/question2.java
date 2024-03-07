package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class question2 {
    static int n;
    static int[] inputArray;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        inputArray = new int[n];
        int a = 0;
        try{
            for (int i = 0; i < inputArray.length; i++){
                inputArray[i] = sc.nextInt();
                a = i;
                if(inputArray[i] == 100){
                    throw new ArrayIndexOutOfBoundsException("no 100");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            for (int i = 0; i < a; i++){
                System.out.print(inputArray[i] + " ");
            }
        }

    }

}
