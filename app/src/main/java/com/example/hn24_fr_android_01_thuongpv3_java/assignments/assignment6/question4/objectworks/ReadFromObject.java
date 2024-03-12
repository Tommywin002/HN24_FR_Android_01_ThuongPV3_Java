package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment6.question4.objectworks;

import com.example.hn24_fr_android_01_thuongpv3_java.assignments.Constain;
import com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment6.question4.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFromObject {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream(Constain.path + "assignments\\assignment6\\question4\\objectworks\\nhanvien.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Đọc mảng nhân viên từ file
            Employee[] employees = (Employee[])  objectInputStream.readObject();

            // In thông tin nhân viên ra màn hình
            for (Employee employee : employees) {
                System.out.println("Id: " + employee.getId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Age: " + employee.getAge());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println("--------------------");
            }

            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
