package com.lessons.Exercices.part6;

public class e4 {
    public static void main(String[] args) {
      /*  4)	Determine el número de veces que debemos dividir un número x por otro
        k antes de alcanzar el número 1. Por ejemplo, para x = 32 y k = 2 la respuesta es 5 que
        son las divisiones necesarias: 32 → 16 → 8 → 4 → 2 → 1
*/
        int number = 32, divisor = 2;
        int i;
        for (i = 1; i <= number; i++) number = number / divisor;
        System.out.println(i);

    }
}
