package com.tutorials7.java.homework06;

import java.util.Scanner;

public class Pr_02_CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().toLowerCase().split("[\\s]+");
        String toCompare = scanner.nextLine().toLowerCase();

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(toCompare)) {
                count++;
            }
        }
        System.out.println(count);
    }
}