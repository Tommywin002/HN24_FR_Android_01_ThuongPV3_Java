package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.question4;

import java.util.List;

public class Family {
    private int idNumber;
    private List<People> peopleList;

    public Family(int idNumber, List<People> peopleList) {
        this.idNumber = idNumber;
        this.peopleList = peopleList;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void printFamilyMember(){
        for (People people: peopleList) {
            System.out.println("Name: " + people.getFullName());
            System.out.println("Age: " + people.getAge());
            System.out.println("Job: " + people.getJob());
            System.out.println("Id number: " + people.getIdCard());
        }
    }



}
