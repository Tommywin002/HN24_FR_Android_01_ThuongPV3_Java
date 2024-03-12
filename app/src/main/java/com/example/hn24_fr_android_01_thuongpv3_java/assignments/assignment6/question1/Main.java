package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment6.question1;

import com.example.hn24_fr_android_01_thuongpv3_java.assignments.Constain;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fileReader = new FileReader(Constain.path + "assignments\\assignment6\\question1\\input.txt");
            BufferedReader br = new BufferedReader(fileReader);
            List<String> inputList = new ArrayList<>();
            Set<String> inputSet = new HashSet<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" "); // Tách các từ trong dòng hiện tại
                inputList.addAll(Arrays.asList(words));
            }
            for (String str: inputList) {
                inputSet.add(str.toLowerCase());
            }
            System.out.println("Number of words: ");
            System.out.println(inputSet.size());
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
