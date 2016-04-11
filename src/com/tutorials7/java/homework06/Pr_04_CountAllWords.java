package com.tutorials7.java.homework06;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr_04_CountAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split("\\W+");

        System.out.println(array.length);
    }
}
