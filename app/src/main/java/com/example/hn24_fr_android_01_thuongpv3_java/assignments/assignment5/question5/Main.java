package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment5.question5;

public class Main {
    private static volatile int totalTime = 0;
    private static final int targetTime = 5;
    public static void main(String[] args) {
        Student student = new Student();
        student.addStudentNameToList("Nguyen Van Huan");
        student.addStudentNameToList("Nguen Linh Duc");
        student.addStudentNameToList("Nguyen Van Tan");
        student.addStudentNameToList("Vu Viet Tung");
        student.addStudentNameToList("Tran Trung Nghia");

        student.addStudentCountryToList("Ha Noi");
        student.addStudentCountryToList("Hung Yen");
        student.addStudentCountryToList("Thanh Hoa");
        student.addStudentCountryToList("Ha Tinh");
        student.addStudentCountryToList("Quang Ninh");

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                super.run();
                while (totalTime < targetTime){
                    student.printStudentName();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    totalTime++;
                }
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                super.run();
                while (totalTime < targetTime){
                    student.printStudentCountry();
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
