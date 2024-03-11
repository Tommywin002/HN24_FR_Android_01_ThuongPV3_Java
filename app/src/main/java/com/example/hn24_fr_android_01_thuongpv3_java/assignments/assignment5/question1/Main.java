package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment5.question1;

public class Main {
    public static void main(String[] args) {
        final Number number = new Number();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                while (true) {
                    super.run();
                    number.printRandomNumber();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                super.run();
                while (true){
                    number.printSquareNumber();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}
