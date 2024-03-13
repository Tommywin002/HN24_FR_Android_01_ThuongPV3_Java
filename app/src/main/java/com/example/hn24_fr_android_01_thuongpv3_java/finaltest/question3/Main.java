package com.example.hn24_fr_android_01_thuongpv3_java.finaltest.question3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //input number
        int number = 0;
        System.out.println("input number: ");
        boolean checkNumber = false;
        while (checkNumber == false){
            if(sc.hasNextInt()){
                number = sc.nextInt();
                checkNumber = true;
            }
            else {
                System.out.println("input again");
                sc.nextLine();
            }
        }
        //input array
        int arr[] = new int[number];
        for(int i = 0; i < number - 1; i++){
            checkNumber = false;
            while (checkNumber == false){
                System.out.println("index " + i + ": ");
                if(sc.hasNextInt()){
                    arr[i] = sc.nextInt();
                    checkNumber = true;
                }
                else {
                    System.out.println("input again");
                    sc.next();
                }
            }
        }

        //print array before
        System.out.println("Array before: ");
        for (int i = 0; i < number - 1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        //print array after sorted
        Arrays.sort(arr);
        System.out.println("Array before: ");
        for (int i = 1; i < number; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        //input 1 number that added to array
        System.out.println("input 1 more number to array: ");
        int moreNumber = 0;
        checkNumber = false;
        while (checkNumber == false){
            if (sc.hasNextInt()){
                moreNumber = sc.nextInt();
                checkNumber = true;
            }
            else{
                System.out.println("Input again");
                sc.nextLine();
            }
        }
        arr[0] = moreNumber;

        //sort array after add 1 number
        Arrays.sort(arr);

        //print array after add 1 number and sorted
        System.out.println("Array after: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
