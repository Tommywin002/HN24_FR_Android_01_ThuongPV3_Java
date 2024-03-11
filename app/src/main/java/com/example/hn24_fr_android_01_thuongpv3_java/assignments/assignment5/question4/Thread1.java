package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment5.question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thread1 extends Thread{
    private List<Integer> integerList = new ArrayList<>();

    public Thread1() {
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }
    public void printIntList(){
        System.out.print("Integer list: ");
        for (Integer integer: integerList) {
            System.out.print(integer + " ");
        }
    }
    @Override
    public void run() {
        super.run();
        int count = 0, maxCount = 10;
        while (count < maxCount){
            Random random = new Random();
            int randowNumber = random.nextInt(101);
            integerList.add(randowNumber);
            System.out.println("Number: " + randowNumber);
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        printIntList();
    }
}
