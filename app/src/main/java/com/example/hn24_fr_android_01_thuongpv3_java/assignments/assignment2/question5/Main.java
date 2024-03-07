package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.question5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input student number: ");
        int inputNumber = sc.nextInt();
        List<Student> studentList = new ArrayList<>();
        //input student
        for(int i = 0; i < inputNumber; i++){
            System.out.println("input name: ");
            String name = sc.next();
            System.out.println("input age: ");
            int age = sc.nextInt();
            System.out.println("input origins: ");
            String origins = sc.next();
            Student student = new Student(name, age, origins);
            studentList.add(student);
        }
        ClassRoom classRoom = new ClassRoom(studentList);
        //print list of student at 20
        System.out.println("List of student at 20: ");
        for (Student student: classRoom.getStudentList()) {
            if(student.getAge() == 20){
                System.out.println("Name: " + student.getName() + ", age: " + student.getAge() + ", origins: " + student.getOriginPlace());
            }
        }
        //print number of student at 23 and origin is Ha Noi
        System.out.println("There are " + classRoom.countStudent() + " student that age is 23 and origin is Ha Noi");

    }
}
