package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть ім'я: ");
        String n1 = scan.nextLine();
        System.out.print("Введіть ім'я: ");
        String n2 = scan.nextLine();
        boolean t = n1.equalsIgnoreCase(n2);
        System.out.print(t);

    }
}
