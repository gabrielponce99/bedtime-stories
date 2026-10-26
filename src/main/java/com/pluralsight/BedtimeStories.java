package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter the Bedtime Story you want to read: ");
        String fileName = inputScanner.nextLine();

        int lineCount = 1;

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(lineCount + ". " + line);
                lineCount++;
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Sorry, that file doesn't exist.");
        }
    }
}
