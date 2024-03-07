package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.question5;

public class Student {
    private String name;
    private int age;
    private String originPlace;

    public Student(String name, int age, String originPlace) {
        this.name = name;
        this.age = age;
        this.originPlace = originPlace;
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

    public String getOriginPlace() {
        return originPlace;
    }

    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace;
    }
}
