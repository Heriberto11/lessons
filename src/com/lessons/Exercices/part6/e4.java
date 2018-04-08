package com.lessons.Exercices.part6;

import java.util.Scanner;

public class e4 {
    public static void main(String[] args) {
      /*  4)	Determine el número de veces que debemos dividir un número x por otro
        k antes de alcanzar el número 1. Por ejemplo, para x = 32 y k = 2 la respuesta es 5 que
        son las divisiones necesarias: 32 → 16 → 8 → 4 → 2 → 1
*/ Scanner scanner = new Scanner(System.in);

        System.out.print("Entre el numero:");
        int number = scanner.nextInt();
        System.out.println("Entre el divisor: " +
                "");
        int divisor= scanner.nextInt();
        int i;
        for (i = 1; i <= number; i++) number = number / divisor;
        System.out.println(i+" divisiones necesarias");

    }
}
