package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment4.question1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] color = {"red", "black", "blue","white", "yellow"};
        String[] color2 = {"orange", "green", "pink","purple", "cyan"};

        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        // add list and list2 elements from color and color2
        for(String colorElement: color){
            list.add(colorElement);
        }
        for (String color2Element: color2){
            list2.add(color2Element);
        }

        //add elemets from list2 to list
        list.addAll(list2);

        //remove all elements from list2
        for (int i = 0; i < list2.size(); i++) {
            list2.remove(i);
        }

        //print list
        System.out.print("List: ");
        for (String listElement: list) {
            System.out.print(listElement + " ");
        }
        System.out.println("");

        //print list has upper case elements
        System.out.print("List has upper case elements: ");
        for (String listElement: list) {
            System.out.print(listElement.toUpperCase() + " ");
        }
        System.out.println("");

        //remove elements number 4 and 6
        list.remove(3);
        list.remove(5);
        System.out.print("List after delete elements number 4 and 6: ");
        for (String listElement: list) {
            System.out.print(listElement + " ");
        }
        System.out.println("");

        //print reverse list
        Collections.reverse(list);
        System.out.print("Reverse list: ");
        for (String listElement: list) {
            System.out.print(listElement + " ");
        }
        System.out.println("");
        System.out.println("");
    }
}
