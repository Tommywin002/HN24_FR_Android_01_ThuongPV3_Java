package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment6.question5;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private float averageScore;

    public Student(int id, String name, int age, String address, float averageScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.averageScore = averageScore;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }
}
