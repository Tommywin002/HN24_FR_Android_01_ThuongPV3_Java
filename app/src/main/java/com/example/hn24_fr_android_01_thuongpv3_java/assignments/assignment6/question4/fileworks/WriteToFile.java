package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment6.question4.fileworks;

import com.example.hn24_fr_android_01_thuongpv3_java.assignments.Constain;
import com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment6.question4.Employee;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteToFile {
    public static List<Employee> employeeList = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        for(int i = 0; i < 3; i++) {
            inputEmployee(i);
        }
        printToFile();
    }

    private static void printToFile() throws IOException {
        FileWriter writer = new FileWriter(Constain.path + "assignments\\assignment6\\question4\\fileworks\\nhanvien.txt");
        for(Employee employee1: employeeList){
            writer.write(employee1.getId() + ", " + employee1.getName() + ", " + employee1.getAge() + ", " + employee1.getSalary() + "\n");
        }
        writer.close();
    }

    public static void inputEmployee(int i){
        System.out.println("Employee " + (i+1) + ": ");
        System.out.println("input id: ");
        String id = sc.next();
        System.out.println("input name: ");
        String name = sc.next();
        System.out.println("input age: ");
        boolean checkAgeType = false;
        int age = 0;
        while (checkAgeType == false){
            if(sc.hasNextInt()){
                age = sc.nextInt();
                checkAgeType = true;
            }
            else {
                System.out.println("input age again");
                sc.nextLine();
            }
        }
        System.out.println("input salary: ");
        boolean checkSalaryType = false;
        float salary = 0;
        while (checkSalaryType == false){
            if(sc.hasNextFloat()){
                salary = sc.nextFloat();
                checkSalaryType = true;
            }
            else {
                System.out.println("input salary again");
                sc.nextLine();
            }
        }
        Employee employee = new Employee(id, name, age, salary);
        employeeList.add(employee);
    }
}
