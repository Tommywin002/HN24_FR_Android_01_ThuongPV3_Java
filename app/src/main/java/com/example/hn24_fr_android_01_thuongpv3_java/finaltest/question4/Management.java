package com.example.hn24_fr_android_01_thuongpv3_java.finaltest.question4;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Management {
    public static List<Contact> contactList = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        inputCommand();
    }
    public static void inputCommand(){
        System.out.println("");
        System.out.println("Choose your selection: ");
        System.out.println("1. Add contact");
        System.out.println("2. Update contact ");
        System.out.println("3. Search contact ");
        System.out.println("4. Sort contact list ");
        System.out.println("5. Print contact list ");
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
                    addContact();
                    break;
                case 2:
                    System.out.println("You choose update");
                    checkCountinues = true;
                    updateContact();
                    break;
                case 3:
                    System.out.println("You choose search");
                    checkCountinues = true;
                    searchContact();
                    break;
                case 4:
                    System.out.println("You choose sort contact list");
                    checkCountinues = true;
                    sortContactList();
                    break;
                case 5:
                    System.out.println("You choose print contact list");
                    checkCountinues = true;
                    printContactList();
                    break;
            }
        }while (checkCountinues == false);
    }

    private static void printContactList() {
        System.out.println("Contact list: ");
        for(Contact contact: contactList){
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone number: " + contact.getPhoneNumber());
            System.out.println("");
        }
        inputCommand();
    }
    public static void sortContactList() {
        Collections.sort(contactList, new Comparator<Contact>() {
            @Override
            public int compare(Contact contact, Contact t1) {
                return contact.getName().compareTo(t1.getName());
            }
        });
        System.out.println("Contact list after sorted: ");
        for(Contact contact: contactList){
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone number: " + contact.getPhoneNumber());
            System.out.println("");
        }
        inputCommand();
    }

    public static void searchContact() {
        int count = 0;
        System.out.println("input name: ");
        String inputSearch = sc.next();
        for (Contact contact: contactList){
            if(contact.getName().contains(inputSearch)){
                System.out.println("Name: " + contact.getName());
                System.out.println("Phone number: " + contact.getPhoneNumber());
                System.out.println("");
                count++;
            }
        }
        if (count == 0)
            System.out.println("There is no contact.");
        inputCommand();
    }

    public static void updateContact() {
        String oldPhoneNumber, newPhoneNumber;
        do {
            System.out.println("input old phone number: ");
            oldPhoneNumber = sc.next();
            if(checkPhoneNumberExists(oldPhoneNumber) == true) {
                System.out.println("There is no phone number.");
            }
        }
        while (checkPhoneNumberExists(oldPhoneNumber) == true);
        do {
            System.out.println("input new phone number: ");
            newPhoneNumber = sc.next();
            if(checkPhoneNumberExists(newPhoneNumber) == false) {
                System.out.println("Phone number already exists.");
            }
        }
        while (checkPhoneNumberExists(newPhoneNumber) == false);
        for(Contact contact: contactList){
            if(contact.getPhoneNumber().equals(oldPhoneNumber)){
                contact.setPhoneNumber(newPhoneNumber);
            }
        }
        inputCommand();
    }

    public static void addContact() {
        System.out.println("input number of contact: ");
        int contactNumber = 0;
        boolean contactNumberChecked = false;
        while (contactNumberChecked == false){
            if (sc.hasNextInt()){
                contactNumber = sc.nextInt();
                contactNumberChecked = true;
            }
            else {
                System.out.println("wrong input type");
                sc.next();
            }
        }
        for (int i = 0; i < contactNumber; i++){
            System.out.println("input name: ");
            String name = sc.next();
            String phoneNumber;
            do {
                System.out.println("input phone number: ");
                phoneNumber = sc.next();
                if(checkPhoneNumberExists(phoneNumber) == false)
                    System.out.println("Contact already exists.");
            }
            while (checkPhoneNumberExists(phoneNumber) == false);
            Contact contact = new Contact(name, phoneNumber);
            contactList.add(contact);
            System.out.println("Contact added successfully.");
        }
        inputCommand();
    }

    public static boolean checkPhoneNumberExists(String phoneNumber){
        for (Contact contact: contactList){
            if(phoneNumber.equals(contact.getPhoneNumber())){
                return false;
            }
        }
        return true;
    }
}
