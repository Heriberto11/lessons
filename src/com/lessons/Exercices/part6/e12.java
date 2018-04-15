package com.lessons.Exercices.part6;

import java.util.Scanner;

public class e12 { /*12)Elabore un programa que dado un entero n > 1, calcule e imprima sucesivamente los elementos
correspondientes a la conjetura de Ullman (en honor al matemático S. Ullman) que consiste en lo siguiente: comience
con cualquier entero positivo. si es par, divídalo entre 2; si es impar multiplíquelo por 3 y agréguele 1. Al final
se obtendrá el número 1, independientemente del entero inicial. Por ejemplo, cuando el entero inicial es 26, la secuencia
será:26 13  40  20 10  5 16  8  4  2  1*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = scanner.nextInt();
        for (int i = 0; i <=100; i++) {
            if (number % 2 == 0) {
                number /= 2;
                System.out.println(number);
            } else {
                number = number * 3 + 1;
                System.out.println(number);
            }
                if (number == 1)
                    break;

        }


    }
}
