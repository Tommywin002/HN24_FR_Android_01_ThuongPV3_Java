package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment6.question3;

import com.example.hn24_fr_android_01_thuongpv3_java.assignments.Constain;
import com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment6.question2.Customers;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static List<Students> studentsList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        addStudent();
        printStudentListToFile();
    }

    private static void printStudentListToFile() throws IOException {
        FileWriter fileWriter = new FileWriter(Constain.path + "assignments\\assignment6\\question3\\sinhvien.txt", false);
        for(Students students: studentsList){
            fileWriter.write(students.getId() + " " + students.getName() + " " + students.getScore() + "\n");

        }
        fileWriter.close();
    }

    private static void addStudent() {
        System.out.println("input number of customer: ");
        int inputNumber = sc.nextInt();
        for(int i = 0; i < inputNumber; i++){
            System.out.println("input ID: ");
            String id = sc.next();
            System.out.println("input name: ");
            String name = sc.next();
            System.out.println("input score: ");
            double score = 0;
            boolean scoreTypeCheck = false;
            while (scoreTypeCheck == false){
                if (sc.hasNextLong()){
                        score = sc.nextDouble();
                        if(score >= 0 && score <= 10){
                            scoreTypeCheck = true;
                        }
                        else
                        {
                            System.out.println("input again");
                            sc.nextLine();
                        }
                }
                else {
                    System.out.println("input score again");
                    sc.nextLine();
                }
            }
            
            Students students = new Students(id, name, score);
            studentsList.add(students);
        }
    }
}
