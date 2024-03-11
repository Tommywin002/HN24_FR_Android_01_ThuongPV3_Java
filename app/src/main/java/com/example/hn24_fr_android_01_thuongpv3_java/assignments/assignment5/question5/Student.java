package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment5.question5;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int index = 0;
    private List<String> studentNameList = new ArrayList<>();
    private List<String> studentCountryList = new ArrayList<>();
    public void addStudentNameToList(String name){
        studentNameList.add(name);
    }
    public void addStudentCountryToList(String country){
        studentCountryList.add(country);
    }

    public synchronized void printStudentName(){
        if(index < 5){
            System.out.println("Name: " + studentNameList.get(index));
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            index++;
            System.out.println("");
        }

    }
    public synchronized void printStudentCountry(){
        if (index < 5){
            System.out.println("Country: " + studentCountryList.get(index));
        }
        notifyAll();
    }
}
