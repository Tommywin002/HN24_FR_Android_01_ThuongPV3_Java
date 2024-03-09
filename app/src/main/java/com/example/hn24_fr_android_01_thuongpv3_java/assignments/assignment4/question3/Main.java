package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment4.question3;

import android.widget.Switch;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static HashMap<Integer, Employee> employeeHashMap = new HashMap<>();
    public static void main(String[] args) {
        System.out.println("Choose your selection: ");
        System.out.println("1. Add");
        System.out.println("2. Display");
        System.out.println("3. Update");
        System.out.println("4. Find");
        String command = sc.next();
        switch(command){
            case "add":
                System.out.println("You chose Add.");
                addEmployeeInformation();
                break;
            case "display":
                System.out.println("display");
                break;
            case "update":
                System.out.println("update");
                break;
            case "find":

                System.out.println("find");
                break;
        }
    }
    public static void addEmployeeInformation(){
        int id = ThreadLocalRandom.current().nextInt(1000, 9000);
        String name;
        System.out.println("Input name: ");
        name = sc.next();
        String gender;
        boolean checkGenderForm1, checkGenderForm2;
        System.out.println("Input gender (only male or female): ");
        do {
            gender = sc.next();
            checkGenderForm1 = gender.contains("male");
            checkGenderForm2 = gender.contains("female");
            if (checkGenderForm1 == false && checkGenderForm2 == false)
                System.out.println("Please input correct gender form.");
        }
        while (checkGenderForm1 == false && checkGenderForm2 == false);
        String dateOfBirth;
        boolean inputDateOfBirthCheck = true;
        System.out.println("Input date of birth (dd/mm/yyyy): ");
        do {
            dateOfBirth = sc.next();
            int len = dateOfBirth.length();
            if(len == 10 ) {
                if (dateOfBirth.charAt(2) != '/' && dateOfBirth.charAt(5) != '/') {
                    System.out.println("Please input correct date of birth form.");
                    inputDateOfBirthCheck = false;
                }
            }
            else
            {
                System.out.println("Please input correct date of birth form.");
                inputDateOfBirthCheck = false;
            }

        }
        while (inputDateOfBirthCheck == false);
        long phoneNumber;
        System.out.println("Input phone number: ");
        phoneNumber = sc.nextLong();
        String degree;
        System.out.println("Input");

    }
}
