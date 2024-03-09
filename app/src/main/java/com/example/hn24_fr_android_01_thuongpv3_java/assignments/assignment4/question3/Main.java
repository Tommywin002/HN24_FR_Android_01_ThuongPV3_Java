package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment4.question3;

import android.widget.Switch;

import com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment4.question2.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static HashMap<Integer, Employee> employeeHashMap = new HashMap<>();
    public static void main(String[] args) {
        inputCommand();
    }
    public static void inputCommand(){
        System.out.println("Choose your selection by the number: ");
        System.out.println("1. Add");
        System.out.println("2. Display");
        System.out.println("3. Update");
        System.out.println("4. Find");
        String command;
        boolean checkCommand;
        do {
            command = sc.next();
            StringBuffer commandBuffer = new StringBuffer();
            commandBuffer.append(command);
            char firstCharInCommand = commandBuffer.charAt(0);
            if(Character.isUpperCase(firstCharInCommand)){
                firstCharInCommand = Character.toLowerCase(firstCharInCommand);
            }
            commandBuffer.setCharAt(0, firstCharInCommand);
            command = commandBuffer.toString();
            switch(command){
                case "add":
                    System.out.println("You chose Add.");
                    checkCommand = true;
                    addEmployeeInformation();
                    break;
                case "display":
                    System.out.println("You chose display");
                    checkCommand = true;
                    displayEmployeeList();
                    break;
                case "update":
                    System.out.println("You chose update");
                    checkCommand = true;
                    updateEmployeeInformation();
                    break;
                case "find":
                    System.out.println("You chose find");
                    checkCommand = true;
                    findEmployeeInformation();
                    break;
                default:
                    checkCommand = false;
                    System.out.println("wrong command number");
                    break;
            }
        }
        while (checkCommand == false);


    }
    public static void addEmployeeInformation(){
        System.out.println("Input number of employee");
        boolean checkNumeberOfEmployee = false;
        int n = 0;
        while (checkNumeberOfEmployee == false){
            if(sc.hasNextInt()){
                n = sc.nextInt();
                checkNumeberOfEmployee = true;
            }
            else {
                System.out.println("Please input correct number type");
                sc.nextLine();
            }

        }
        for(int i = 0; i < n; i++){
            int id = ThreadLocalRandom.current().nextInt(1000, 9000);
            System.out.println("ID: " + id);
            employeeHashMap.put(id, setEmployee(id));
            System.out.println("");
        }
        inputCommand();
    }
    public static void displayEmployeeList(){
        if(employeeHashMap.isEmpty() == true){
            System.out.println("No found information.");
        }
        else {
            System.out.println("Employee Information: ");
            for(Map.Entry<Integer, Employee> entry : employeeHashMap.entrySet()){
                System.out.println("ID: " + entry.getValue().getId());
                System.out.println("Name: " + entry.getValue().getName());
                System.out.println("Gender: " + entry.getValue().getGender());
                System.out.println("Date of Birth: " + entry.getValue().getDateOfBirth());
                System.out.println("Phone number: " + entry.getValue().getPhoneNumber());
                System.out.println("Degree: " + entry.getValue().getDegree());
                System.out.println("");
            }
        }
        inputCommand();
    }
    public static void updateEmployeeInformation(){
        if(employeeHashMap.isEmpty()){
            System.out.println("No found information.");
        }
        else {
            System.out.println("Input ID: ");
            int idChecked = sc.nextInt();
            for(Map.Entry<Integer, Employee> entry : employeeHashMap.entrySet()){
                if(entry.getKey() == idChecked){
                    employeeHashMap.put(idChecked, setEmployee(idChecked));
                }
            }
        }
        inputCommand();
    }
    public static void findEmployeeInformation(){
        int count;
        System.out.println("Search by: ");
        System.out.println("1. Id");
        System.out.println("2. Name");
        String searchChoose;
        boolean searchChecked = false;
        do {
            searchChoose = sc.next();
            StringBuffer searchBuffer = new StringBuffer();
            searchBuffer.append(searchChoose);
            char firstCharInChoose = searchBuffer.charAt(0);
            if(Character.isUpperCase(firstCharInChoose)){
                firstCharInChoose = Character.toLowerCase(firstCharInChoose);
            }
            searchBuffer.setCharAt(0, firstCharInChoose);
            searchChoose = searchBuffer.toString();
            System.out.print("Search: ");
            switch (searchChoose){
                case "id":
                    boolean checkIdInput = false;
                    while (checkIdInput == false){
                        count = 0;
                        if(sc.hasNextInt()){
                            int seachIdCheck = sc.nextInt();
                            for(Map.Entry<Integer, Employee> entry : employeeHashMap.entrySet()){
                                if(seachIdCheck == entry.getKey()){
                                    System.out.println("ID: " + entry.getValue().getId());
                                    System.out.println("Name: " + entry.getValue().getName());
                                    System.out.println("Gender: " + entry.getValue().getGender());
                                    System.out.println("Date of Birth: " + entry.getValue().getDateOfBirth());
                                    System.out.println("Phone number: " + entry.getValue().getPhoneNumber());
                                    System.out.println("Degree: " + entry.getValue().getDegree());
                                    System.out.println("");
                                    count++;
                                }
                            }
                            if(count == 0){
                                System.out.println("Not found information");
                            }
                            checkIdInput = true;
                        }
                        else {
                            System.out.println("Please input correct number id");
                            sc.nextLine();
                        }
                    }
                    searchChecked = true;
                    break;
                case "name":
                    count = 0;
                    String searchNameCheck = sc.next();
                    for(Map.Entry<Integer, Employee> entry : employeeHashMap.entrySet()){
                        if(searchNameCheck.equals(entry.getValue().getName())){
                            System.out.println("ID: " + entry.getValue().getId());
                            System.out.println("Name: " + entry.getValue().getName());
                            System.out.println("Gender: " + entry.getValue().getGender());
                            System.out.println("Date of Birth: " + entry.getValue().getDateOfBirth());
                            System.out.println("Phone number: " + entry.getValue().getPhoneNumber());
                            System.out.println("Degree: " + entry.getValue().getDegree());
                            System.out.println("");
                            count++;
                        }
                    }
                    if(count == 0){
                        System.out.println("Not found information");
                    }
                    searchChecked = true;
                    break;
            }
        }
        while (searchChecked == false);
        inputCommand();
    }
    public static Employee setEmployee(int id){
        String name;
        System.out.println("Input name: ");
        name = sc.next();
        String gender;
        System.out.println("Input gender (only male or female): ");
        do {
            gender = sc.next();
        }
        while (checkGenderFormat(gender) == false);
        String dateOfBirth;
        System.out.println("Input date of birth (dd/mm/yyyy): ");
        do {
            dateOfBirth = sc.next();
        }
        while (checkDateOfBirthFormat(dateOfBirth) == false);
        System.out.println("Input phone number: ");
        long phoneNumber = 0;
        boolean checkPhoneNumber = false;
        while (checkPhoneNumber == false){
            if(sc.hasNextLong()){
                phoneNumber = sc.nextLong();
                if(phoneNumber > 99999999)
                    checkPhoneNumber = true;
                else
                    System.out.println("Please input full number");
            }
            else {
                System.out.println("Wrong input");
                sc.nextLine();
            }
        }

        String degree;
        System.out.println("Input your degree: ");
        System.out.println("1. Intermediate ");
        System.out.println("2. University ");
        System.out.println("3. College ");
        do {
            degree = sc.next();
            StringBuffer degreeBuffer = new StringBuffer();
            degreeBuffer.append(degree);
            char firstCharInDegree = degreeBuffer.charAt(0);
            if(Character.isUpperCase(firstCharInDegree)){
                firstCharInDegree = Character.toLowerCase(firstCharInDegree);
            }
            degreeBuffer.setCharAt(0, firstCharInDegree);
            degree = degreeBuffer.toString();

        }while (checkDegree(degree) == false);
        Employee employee = new Employee(id, name, gender, dateOfBirth, phoneNumber, degree);
        return employee;
    }
    public static boolean checkGenderFormat(String gender){
        boolean checkGenderForm1, checkGenderForm2;
        checkGenderForm1 = gender.contains("male");
        checkGenderForm2 = gender.contains("female");
        if (checkGenderForm1 == false && checkGenderForm2 == false)
        {
            System.out.println("Please input correct gender form.");
            return false;
        }
        return true;
    }
    public static boolean checkDateOfBirthFormat(String dateOfBirth){
        int len = dateOfBirth.length();
        if(len == 10 ) {
            if (dateOfBirth.charAt(2) != '/' && dateOfBirth.charAt(5) != '/') {
                System.out.println("Please input correct date of birth form.");
                return false;
            }
        }
        else
        {
            System.out.println("Please input correct date of birth form.");
            return false;
        }
        return true;
    }
    public static boolean checkDegree(String degree){
        boolean degreeChecked1, degreeChecked2, degreeChecked3;
        degreeChecked1 = degree.contains("intermediate");
        degreeChecked2 = degree.contains("university");
        degreeChecked3 = degree.contains("college");
        if(degreeChecked1 == false && degreeChecked2 == false && degreeChecked3 == false){
            System.out.println("Please input correct degree type");
            return false;
        }
        return true;
    }
}
