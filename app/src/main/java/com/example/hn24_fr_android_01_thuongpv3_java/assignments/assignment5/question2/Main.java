package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment5.question2;

public class Main {
    private static volatile int totalTime = 0;
    private static final int targetTime = 20;
    public static void main(String[] args) {
        final Characters characters = new Characters();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                super.run();
                while (totalTime < targetTime){
                    characters.printRandomCharacter();
                    try {
                        Thread.sleep(2000);
                        totalTime = totalTime + 2;
                        System.out.println("current time: " + totalTime);
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
                while (totalTime < targetTime){
                    characters.printUpperCaseCharacter();
                    try {
                        Thread.sleep(1000);
                        totalTime++;
                        System.out.println("current time: " + totalTime);
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
