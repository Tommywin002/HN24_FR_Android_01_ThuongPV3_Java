package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment4.question2;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static HashMap<Integer, Student> studentHashMap = new HashMap<Integer, Student>();
    public static void main(String[] args) {
        int n = 0;
        boolean checkN = false;
        while (checkN == false){
            if(sc.hasNextInt()){
                n = sc.nextInt();
                checkN = true;
            }
            else {
                System.out.println("Please input correct number");
                sc.nextLine();
            }
        }
        System.out.println(n);
        inputStudentToHashMap(n);
        printStudentList();
        searchStudent();
    }
    //add students
    public static void inputStudentToHashMap(int n){
        for(int i = 0; i < n; i++){
            //input RollNo
            System.out.println("input RollNo: ");
            int rollNo = 0;
            boolean checkRollNo = false;
            do{
                while (checkRollNo == false){
                    if(sc.hasNextInt()){
                        rollNo = sc.nextInt();
                        if (studentHashMap.containsKey(rollNo)) {
                            System.out.println("There are already have this RollNo");
                        }
                        checkRollNo = true;
                    }
                    else {
                        System.out.println("Please input correct RollNo");
                        sc.nextLine();
                    }
                }
            }
            while (studentHashMap.containsKey(rollNo));
            //input Name
            System.out.println("input name: ");
            String name = sc.next();
            //input sex
            System.out.println("input sex: ");
            String sex;
            boolean checkSexForm1, checkSexForm2;
            do {
                sex = sc.next();
                checkSexForm1 = sex.contains("male");
                checkSexForm2 = sex.contains("female");
                if(checkSexForm1 == false && checkSexForm2 == false){
                    System.out.println("Please input sex correct form");
                }
            }
            while (checkSexForm1 == false && checkSexForm2 == false);
            //input age
            System.out.println("input age: ");
            int age = 0;
            try {
                age = sc.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("wrong input");
            }
            //input email
            System.out.println("input email: ");
            String email;
            boolean checkEmailForm;
            do {
                email = sc.next();
                checkEmailForm = email.contains("@gmail.com");
                if(checkEmailForm == false){
                    System.out.println("Please input email correct form");
                }
            }
            while (checkEmailForm == false);
            //input address
            System.out.println("input address: ");
            String address = sc.next();
            //put information into Hashmap
            Student student = new Student(rollNo, name, sex, age, email, address);
            studentHashMap.put(student.getRollNo(), student);
            System.out.println("");
        }
    }
    //print students information
    public static void printStudentList(){
        System.out.println("Student information: ");
        for(Map.Entry<Integer, Student> entry : studentHashMap.entrySet()){
            System.out.println("RollNo: " + entry.getValue().getRollNo());
            System.out.println("Name: " + entry.getValue().getName());
            System.out.println("Sex: " + entry.getValue().getSex());
            System.out.println("Age: " + entry.getValue().getAge());
            System.out.println("Email: " + entry.getValue().getEmail());
            System.out.println("Address: " + entry.getValue().getAddress());
            System.out.println("");
        }
    }
    //search student
    public static void searchStudent(){
        int count = 0;
        System.out.println("Search student by RollNo: ");
        int searchInput = 0;
        try {
            searchInput = sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("wrong input");
        }
        for(Map.Entry<Integer, Student> entry : studentHashMap.entrySet()){
            if(entry.getKey() == searchInput){
                System.out.println("RollNo: " + entry.getValue().getRollNo());
                System.out.println("Name: " + entry.getValue().getName());
                System.out.println("Sex: " + entry.getValue().getSex());
                System.out.println("Age: " + entry.getValue().getAge());
                System.out.println("Email: " + entry.getValue().getEmail());
                System.out.println("Address: " + entry.getValue().getAddress());
                count++;
            }
        }
        if (count == 0)
            System.out.println("There is no student that rollNo match your search");
    }
}
