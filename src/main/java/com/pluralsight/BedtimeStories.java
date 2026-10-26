package com.pluralsight;

import java.io.*;

public class BedtimeStories {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("goldilocks.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            System.out.println(line);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Sorry, that file doesn't exist.");
        }
    }
}
