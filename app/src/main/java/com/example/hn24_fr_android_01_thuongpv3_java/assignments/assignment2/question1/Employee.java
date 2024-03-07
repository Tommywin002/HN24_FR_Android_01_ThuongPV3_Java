package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.question1;

public abstract class Employee {
    private String name;
    private String birthDay;
    private int salary;

    public Employee(String name, String birthDay, int salary) {
        this.name = name;
        this.birthDay = birthDay;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printInformation(String name, String date, int salary) {
        System.out.println("Infomation: " + name + " | " + date + " | " + salary);
    }
    public abstract int caculateSalary();
    public void printRole(){}

}
