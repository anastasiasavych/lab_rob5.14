package com.company;

import java.util.Scanner;

public class Task1 {
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
        word1 = word1.concat(" " + word2 + " " + word3 + " " + word4 + " " + word5);
        System.out.print(word1 + ".");
    }
}
