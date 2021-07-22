package com.company;

import java.io.*;
import java.util.Scanner;

/************************************
 * This program was designed to     *
 * access a file and read the first *
 * line from it.                    *
 * It also contains an example of   *
 * using the hasNext() method to    *
 * be able to determine whether a   *
 * file has reached the end of its  *
 * usable data.                     **
 * *********************************/

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the name of a file: ");
        String filename = keyboard.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {
            String friendName = inputFile.nextLine();
            System.out.println(friendName);
        }

        inputFile.close();

    }
}
