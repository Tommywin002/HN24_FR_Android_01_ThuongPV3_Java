package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment6.question4.objectworks;

import com.example.hn24_fr_android_01_thuongpv3_java.assignments.Constain;
import com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment6.question4.Employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WirteToObject {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("1", "timmy", 23, 2000);
        employees[1] = new Employee("2", "ben", 22, 2000);
        employees[2] = new Employee("3", "mark",20, 2000);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(Constain.path + "assignments\\assignment6\\question4\\objectworks\\nhanvien.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Ghi mảng nhân viên vào file
            objectOutputStream.writeObject(employees);

            objectOutputStream.close();
            System.out.println("Mảng nhân viên đã được ghi vào file thành công.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
