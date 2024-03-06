package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.Question1;

public class Main {
    public static void main(String[] args) {
        ManifactureEmployee manifactureEmployee1 = new ManifactureEmployee();
        OfficeEmployee officeEmployee1 = new OfficeEmployee();

        manifactureEmployee1.setName("Jim");
        manifactureEmployee1.setBirthDay("2/2/2022");
        manifactureEmployee1.setManiualSalary(2000);
        manifactureEmployee1.setProductNumber(30);
        manifactureEmployee1.setSalary(manifactureEmployee1.caculateSalary());
        manifactureEmployee1.printInformation(manifactureEmployee1.getName(), manifactureEmployee1.getBirthDay(), manifactureEmployee1.getSalary());

        officeEmployee1.setName("Tom");
        officeEmployee1.setBirthDay("13/4/2002");
        officeEmployee1.setHourNumber(50);
        officeEmployee1.setSalary(officeEmployee1.caculateSalary());
        officeEmployee1.printInformation(officeEmployee1.getName(), officeEmployee1.getBirthDay(), officeEmployee1.getSalary());

        Employee manifactureEmployee2 = new ManifactureEmployee();
        Employee officeEmployee2 = new OfficeEmployee();

        manifactureEmployee2.printRole();
        officeEmployee2.printRole();
    }
}
