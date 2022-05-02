package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Поле '1' для введення: ");
        String s1 = scan.nextLine();
        System.out.print("Поле '2' для введення: ");
        String s2 = scan.nextLine();
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1>l2){
            System.out.print("Рядок: '" + s1 + "' є більшим.");
        } else if(l1<l2){
            System.out.print("Рядок: " + s2 + "- є більшим.");
        }else if(l1==l2) {
            System.out.print("Рядки рівні.");
        }

    }
}
