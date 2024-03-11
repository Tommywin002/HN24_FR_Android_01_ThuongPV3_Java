package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment5.question3;

public class Main {
    public static void main(String[] args) {
        final Data data = new Data();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                super.run();
                while (data.getTotal() > -100 && data.getTotal() < 100){
                    data.addRandomNumberFromNegativeOneHundredToZero();
                    try {
                        Thread.sleep(1000);
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
                while (data.getTotal() > -100 && data.getTotal() < 100){
                    data.addRandomNumberFromZeroToOneHundred();
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
