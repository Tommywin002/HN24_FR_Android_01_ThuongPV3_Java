package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment6.question5;

import com.example.hn24_fr_android_01_thuongpv3_java.assignments.Constain;
import com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment4.question3.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static String path = Constain.path + "assignments\\assignment6\\question5\\student.txt";
    public static Scanner sc = new Scanner(System.in);
    public static Map<Integer, Student> studentMap = new LinkedHashMap<>();
    public static void main(String[] args) throws IOException {
        inputCommand();
    }
    //command
    public static void inputCommand() throws IOException {
        System.out.println("");
        System.out.println("Choose your selection: ");
        System.out.println("1. Add student");
        System.out.println("2. Update student ");
        System.out.println("3. Delete student ");
        System.out.println("4. Arrange by name ");
        System.out.println("5. Arrange by average score ");
        System.out.println("6. Print student list ");
        System.out.println("0. Shutdown ");
        int selectionNumber = 0;
        boolean checkSelectedNumber = false;
        while (checkSelectedNumber == false){
            if (sc.hasNextInt()){
                selectionNumber = sc.nextInt();
                checkSelectedNumber = true;
            }
            else {
                System.out.println("wrong input command");
                sc.nextLine();
            }
        }
        
        boolean checkCountinues = false;
        do {
            switch (selectionNumber){
                case 1:
                    System.out.println("You choose add");
                    checkCountinues = true;
                    addStudent();
                    break;
                case 2:
                    System.out.println("You choose update");
                    checkCountinues = true;
                    updateStudent();
                    break;
                case 3:
                    System.out.println("You choose delete");
                    checkCountinues = true;
                    deleteStudent();
                    break;
                case 4:
                    System.out.println("You choose arrange by name");
                    checkCountinues = true;
                    arranngeStudentListByName();
                    break;
                case 5:
                    System.out.println("You choose arrange by average score");
                    checkCountinues = true;
                    arranngeStudentListByAverangeScore();
                    break;
                case 6:
                    System.out.println("You choose print student list");
                    checkCountinues = true;
                    printStudentList();
                    break;
                case 0:
                    System.out.println("Shut down");
                    checkCountinues = true;
                    break;
                default:
                    checkCountinues = false;
                    break;
            }
        }while (checkCountinues == false);
    }
    //work with file
    public static void saveInFile() throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        if(studentMap.isEmpty()){
            System.out.println("Please add more student");
        }
        else {
            for(Map.Entry<Integer, Student> entry : studentMap.entrySet()){
                fileWriter.write(entry.getValue().getId() + "    "
                        + entry.getValue().getName() + "    "
                        + entry.getValue().getAge() + "    "
                        + entry.getValue().getAddress() + "    "
                        + entry.getValue().getAverageScore() + "\n");
            }
        }
        fileWriter.close();
    }
    public static void readFromFile() throws IOException {
        studentMap = new LinkedHashMap<>();
        FileReader fileReader = new FileReader(path);
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split("    "); // Tách các từ trong dòng hiện tại
            Student student = new Student(Integer.parseInt(words[0]), words[1], Integer.parseInt(words[2]), words[3], Float.parseFloat(words[4]));
            studentMap.put(Integer.parseInt(words[0]), student);
        }
        br.close();
    }
    //command option
    public static void printStudentList() throws IOException {
        readFromFile();
        System.out.println("List of student");
        for(Map.Entry<Integer, Student> entry : studentMap.entrySet()){
            System.out.println("ID: " + entry.getValue().getId());
            System.out.println("Name: " + entry.getValue().getName());
            System.out.println("Age: " + entry.getValue().getAge());
            System.out.println("Address: " + entry.getValue().getAddress());
            System.out.println("Average score: " + entry.getValue().getAverageScore());
            System.out.println("");
        }
        inputCommand();
    }
    public static void arranngeStudentListByAverangeScore() throws IOException {
        readFromFile();
        List<Map.Entry<Integer, Student>> entryList = new ArrayList<>(studentMap.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Student>>() {
            @Override
            public int compare(Map.Entry<Integer, Student> entry1, Map.Entry<Integer, Student> entry2) {
                return Float.compare(entry1.getValue().getAverageScore(), entry2.getValue().getAverageScore());
            }
        });
        studentMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Student> entry: entryList){
            studentMap.put(entry.getKey(), entry.getValue());
        }
        saveInFile();
        inputCommand();
    }
    public static void arranngeStudentListByName() throws IOException {
        readFromFile();
        List<Map.Entry<Integer, Student>> entryList = new ArrayList<>(studentMap.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Student>>() {
            @Override
            public int compare(Map.Entry<Integer, Student> entry1, Map.Entry<Integer, Student> entry2) {
                return entry1.getValue().getName().compareTo(entry2.getValue().getName());
            }
        });
        studentMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Student> entry: entryList){
            studentMap.put(entry.getKey(), entry.getValue());
        }
        saveInFile();
        inputCommand();
    }
    public static void deleteStudent() throws IOException {
        readFromFile();
        System.out.println("input student id: ");
        int idChange = 0;
        boolean idFormChecked = false;
        while (idFormChecked == false){
            if(sc.hasNextInt()){
                idChange = sc.nextInt();
                idFormChecked = true;
            }
            else {
                System.out.println("please input id again");
                sc.nextLine();
            }
        }
        int countStudent = 0;
        for(Map.Entry<Integer, Student> entry : studentMap.entrySet()){
            if(entry.getKey() == idChange){
                studentMap.remove(entry.getKey());
                countStudent++;
            }
        }
        if(countStudent == 0)
            System.out.println("There is no student with id: " + idChange);
        saveInFile();
        inputCommand();
    }
    public static void updateStudent() throws IOException {
        readFromFile();
        System.out.println("input student id: ");
        int idChange = 0;
        boolean idFormChecked = false;
        while (idFormChecked == false){
            if(sc.hasNextInt()){
                idChange = sc.nextInt();
                idFormChecked = true;
            }
            else {
                System.out.println("please input id again");
                sc.nextLine();
            }
        }
        for(Map.Entry<Integer, Student> entry : studentMap.entrySet()){
            if(entry.getKey() == idChange){
                studentMap.put(entry.getKey(), setStudent(entry.getKey()));
            }
        }
        saveInFile();
        inputCommand();
    }
    public static void addStudent() throws IOException {
        System.out.println("input number of student: ");
        int numberInput = 0;
        boolean checkNumberInput = false;
        while (checkNumberInput == false){
            if(sc.hasNextInt()){
                numberInput = sc.nextInt();
                checkNumberInput = true;
            }
            else {
                System.out.println("input number of student again.");
                sc.nextLine();
            }
        }
        for(int i = 0; i < numberInput; i++){
            int id = ThreadLocalRandom.current().nextInt(1000, 9000);
            studentMap.put(id, setStudent(id));
        }
        saveInFile();
        inputCommand();
    }
    //set new student
    public static Student setStudent(int id){
        System.out.println("ID: " + id);
        System.out.println("input name: ");
        String name = sc.next();
        System.out.println("input age: ");
        int age = 0;
        boolean checkAgeForm = false;
        while (checkAgeForm == false){
            if (sc.hasNextInt()){
                age = sc.nextInt();
                checkAgeForm = true;
            }
            else {
                System.out.println("please input correct age form");
                sc.nextLine();
            }
        }
        System.out.println("input address");
        String address;
        address = sc.next();
        System.out.println("input average score: ");
        float averageScore = 0;
        boolean checkAverageScore = false;
        while (checkAverageScore == false){
            if(sc.hasNextFloat()){
                averageScore = sc.nextFloat();
                checkAverageScore = true;
            }
            else {
                System.out.println("Please input correct average score");
                sc.nextLine();
            }
        }
        Student student = new Student(id, name, age, address, averageScore);
        return student;
    }
}
