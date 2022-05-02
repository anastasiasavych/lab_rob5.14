package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть слово:");
        String word1 = scan.nextLine();
        System.out.print("Введіть слово:");
        String word2 = scan.nextLine();
        System.out.print("Введіть слово:");
        String word3 = scan.nextLine();
        System.out.print("Введіть слово:");
        String word4 = scan.nextLine();
        System.out.print("Введіть слово:");
        String word5 = scan.nextLine();
        System.out.println(word1.substring(0,1));
        System.out.println(word2.substring(0,1));
        System.out.println(word3.substring(0,1));
        System.out.println(word4.substring(0,1));
        System.out.println(word5.substring(0,1));
    }
}
