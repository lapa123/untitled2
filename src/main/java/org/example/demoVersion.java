package org.example;
import java.io.*;

import java.nio.file.*;
import java.util.Scanner;



public class demoVersion {
    public static void main(String[] args) {
       /* private static void CreateFile {

            File newFile = new File("data.txt");
            try {
                if (newFile.createNewFile()) {
                    System.out.println("File is created");
                } else {
                    System.out.println("File creation's error");
                }
            } catch (IOException e) {
                System.out.println("File error");
            }
        }*/
        File newDirectory = new File("program");

            if (newDirectory.mkdirs()) {
                System.out.println("Directory is created");
            } else {
                System.out.println("Directory creation's error");
            }


    }
}
