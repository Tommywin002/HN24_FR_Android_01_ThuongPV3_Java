package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment5.question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thread2 extends Thread{
    private List<Character> characterList = new ArrayList<>();

    public Thread2() {
    }

    public List<Character> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;
    }
    public void printCharList(){
        System.out.print("Character list: ");
        for (Character character: characterList) {
            System.out.print(character + " ");
        }
    }
    @Override
    public void run() {
        super.run();
        int count = 0, maxCount = 10;
        while (count < maxCount){
            Random random = new Random();
            char randomCharacter = (char) (random.nextInt(26) + 'a');
            System.out.println("Character: " + randomCharacter);
            characterList.add(randomCharacter);
            count++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        printCharList();
    }
}
