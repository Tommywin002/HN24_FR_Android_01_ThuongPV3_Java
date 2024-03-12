package com.example.hn24_fr_android_01_thuongpv3_java.assignments.assignment6.question4.fileworks;

import com.example.hn24_fr_android_01_thuongpv3_java.assignments.Constain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(Constain.path + "assignments\\assignment6\\question4\\fileworks\\nhanvien.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split(", "); // Tách các từ trong dòng hiện tại
            for (int i = 0; i < words.length; i++){
                System.out.print(words[i] + " ");
            }
            System.out.println("");
        }
    }
}
