package com.lessons.part5;

import java.util.Scanner;

public class e16 {
    /*16)	Implemente un programa que muestre todos los múltiplos de n entre a y b inclusive, donde todos los valores
     de n, a y b son introducidos por teclado*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("entra n:");
        int n = scanner.nextInt();
        System.out.println("entra a:");
        int a = scanner.nextInt();
        System.out.println("entra b");
        int b = scanner.nextInt();
        int number = 0;
        for (int i = 1; i <= 100; i++) {
            number += n;
            if (number >= a && number <= b)
                System.out.println(number);
            if (number > b)
                break;
        }



    }
}