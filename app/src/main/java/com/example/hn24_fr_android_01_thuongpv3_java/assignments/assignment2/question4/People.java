package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.question4;

public class People {
    private String fullName;
    private int age;
    private String job;
    private long idNumber;

    public People(String fullName, int age, String job, long idNumber) {
        this.fullName = fullName;
        this.age = age;
        this.job = job;
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public long getIdCard() {
        return idNumber;
    }

    public void setIdCard(long idCard) {
        this.idNumber = idCard;
    }
}
