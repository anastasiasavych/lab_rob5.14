package com.company;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть дробове число: ");
        float d1 = scan.nextFloat();
        System.out.print("Введіть дробове число: ");
        float d2 = scan.nextFloat();
        System.out.print("Введіть дробове число: ");
        float d3 = scan.nextFloat();
        if (d1%1 != 0 && d2%1 != 0 && d3%1 != 0) {
            if (d1 > d2 && d1 > d3) {
                System.out.print("Найбільше число: " + d1);
            } else if (d2 > d1 && d2 > d3) {
                System.out.print("Найбільше число: " + d2);
            } else if (d3 > d2 && d3 > d1) {
                System.out.print("Найбільше число: " + d3);
            } else if (d1 == d2 && d2 == d3) {
                System.out.println("Введені числа однакові.");
            } else if (d1 == d2) {
                System.out.println("Ці числа однакові та найбльші серед введених: " + d1 + ";" + d2);
            } else if (d1 == d3) {
                System.out.println("Ці числа однакові та найбльші серед введених: " + d1 + ";" + d3);
            } else if (d2 == d3) {
                System.out.println("Ці числа однакові та найбльші серед введених: " + d2 + ";" + d3);
            }
        }else {
            System.out.println("Ви ввели не дробове число!");
        }
    }
}
