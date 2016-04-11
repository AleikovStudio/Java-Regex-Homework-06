package com.tutorials7.java.homework06;

import java.util.Scanner;

public class Pr_03_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().toLowerCase().split("\\W+");
        String textToCompare = scanner.nextLine();

//        for (String arrayEl: array) {
//            System.out.println(arrayEl);
//        }

        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (textToCompare.equals(array[i])) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
