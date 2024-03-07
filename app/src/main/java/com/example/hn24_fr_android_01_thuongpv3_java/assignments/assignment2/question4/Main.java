package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Long> idNumberList;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        idNumberList = new ArrayList<>();
        List<Family> familyList = new ArrayList<>();
        System.out.println("input numer of family: ");
        int inputNumber = sc.nextInt();
        //input family
        for(int i = 0; i < inputNumber; i++){
            System.out.println("input family " + (i+1) + ": ");
            System.out.println("input member number: ");
            int familyNumber = sc.nextInt();
            List<People> peopleList = new ArrayList<>();
            //input family members
            for (int j = 0; j < familyNumber; j++){
                System.out.println("Family " + i+1 +" member " + (j+1) + ": ");
                System.out.println("input name: ");
                String name = sc.next();
                System.out.println("input age: ");
                int age = sc.nextInt();
                System.out.println("input job: ");
                String job = sc.next();
                long idNumber;
                System.out.println("input id number: ");
                //check people id number
                idNumber = sc.nextLong();
                People people = new People(name, age, job, idNumber);
                peopleList.add(people);
            }
            Family family = new Family(i + 1, peopleList);
            familyList.add(family);
        }
        Street street1 = new Street(familyList);
        //print family information
        System.out.println("");
        System.out.println("Output: ");
        for (Family family: street1.getFamilyList()) {
            System.out.println("Family " + family.getIdNumber());
            family.printFamilyMember();
            System.out.println("");
        }

    }

}
