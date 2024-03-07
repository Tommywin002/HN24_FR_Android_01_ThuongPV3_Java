package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment2.question2;

public class Main {
    public static void main(String[] args) {
        addCustomer();
    }
    public static void addCustomer(){
        CloseCustomer closeCustomer = new CloseCustomer();
        closeCustomer.setName("Tim");
        closeCustomer.setProductAmount(10);
        closeCustomer.setProductPrice(2000);
        closeCustomer.setYear(10);
        closeCustomer.setPaymentMoney(closeCustomer.caculateTotalMoney(closeCustomer.getProductAmount(), closeCustomer.getProductPrice(), closeCustomer.getYear()));
        closeCustomer.printTotalMoney(closeCustomer.getName(), closeCustomer.getPaymentMoney());

        NormalCustomer normalCustomer = new NormalCustomer();
        normalCustomer.setName("Carl");
        normalCustomer.setProductAmount(15);
        normalCustomer.setProductPrice(1000);
        normalCustomer.setPaymentMoney(normalCustomer.caculateTotalMoney(normalCustomer.getProductAmount(), normalCustomer.getProductPrice()));
        normalCustomer.printTotalMoney(normalCustomer.getName(), normalCustomer.getPaymentMoney());

        SpecialCustomer specialCustomer = new SpecialCustomer();
        specialCustomer.setName("Jack");
        specialCustomer.setProductAmount(30);
        specialCustomer.setProductPrice(2500);
        specialCustomer.setPaymentMoney(specialCustomer.caculateTotalMoney(specialCustomer.getProductAmount(), specialCustomer.getProductPrice()));
        specialCustomer.printTotalMoney(specialCustomer.getName(), specialCustomer.getPaymentMoney());
        System.out.println("Total: " + (closeCustomer.getPaymentMoney() + normalCustomer.getPaymentMoney() + specialCustomer.getPaymentMoney()));
    }
}
