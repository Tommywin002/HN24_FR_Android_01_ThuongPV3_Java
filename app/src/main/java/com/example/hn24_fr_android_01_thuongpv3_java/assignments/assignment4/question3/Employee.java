package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment4.question3;

public class Employee {
    private int id;
    private String name;
    private String gender;
    private String dateOfBirth;
    private long phoneNumber;

    public Employee(int id, String name, String sex, String dateOfBirth, long phoneNumber) {
        this.id = id;
        this.name = name;
        this.gender = sex;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String sex) {
        this.gender = sex;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
