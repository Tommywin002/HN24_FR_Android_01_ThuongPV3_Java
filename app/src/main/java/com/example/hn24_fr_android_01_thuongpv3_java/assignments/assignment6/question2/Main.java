package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment6.question2;

import com.example.hn24_fr_android_01_thuongpv3_java.assignments.Constain;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static List<Customers> customersLíst = new ArrayList<Customers>();
    public static void main(String[] args) throws IOException {
        addCustomer();
        printCustomerListToFile();
    }

    private static void printCustomerListToFile() throws IOException {
        FileWriter fileWriter = new FileWriter(Constain.path + "assignments\\assignment6\\question2\\khachhang.txt", false);
        for(Customers customers: customersLíst){
            fileWriter.write(customers.getId() + " " + customers.getName() + " " + customers.getPhoneNumber() + "\n");

        }
        fileWriter.close();
    }

    public static void addCustomer(){
        System.out.println("input number of customer: ");
        int inputNumber = sc.nextInt();
        for(int i = 0; i < inputNumber; i++){
            System.out.println("input ID: ");
            String id = sc.next();
            System.out.println("input name: ");
            String name = sc.next();
            System.out.println("input phone number: ");
            String phoneNumber;
            phoneNumber = sc.next();
            String formatPhoneNumber = phoneNumber.substring(0, 3) + '.' + phoneNumber.substring(3);
            Customers customers = new Customers(id, name, formatPhoneNumber);
            customersLíst.add(customers);
        }
    }
}
