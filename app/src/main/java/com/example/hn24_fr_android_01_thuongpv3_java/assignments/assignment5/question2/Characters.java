package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment5.question2;

import java.util.Random;

import javax.xml.parsers.SAXParser;

public class Characters {
    char inputCharacter;

    public Characters() {
    }
    public synchronized void printRandomCharacter(){
        System.out.print("Random character: ");
        Random random = new Random();
        inputCharacter = (char) (random.nextInt(26) + 'a');
        System.out.println(inputCharacter);
        notifyAll();


    }
    public synchronized void printUpperCaseCharacter(){
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        char upperCaseChar = Character.toUpperCase(inputCharacter);
        System.out.println("Upper case character: " + upperCaseChar);

    }

}
