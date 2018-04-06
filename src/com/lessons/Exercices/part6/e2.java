package com.lessons.Exercices.part6;

import java.util.Scanner;

public class e2 {
    /*
    2)	Diseñe un programa que solicite la entrada de un número entre a y b. Si el usuario teclea el número fuera del
    rango válido, el programa solicitará la entrada del valor hasta que sea correcta.
     */
    public static void main(String[] args) {
        int a = 12, b = 33, n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Entre el numero:");
            n = scanner.nextInt();
        } while (n < a || n > b);
/*
        while (true) {
            System.out.print("Entre el numero:");
            n = scanner.nextInt();
            if (n >= a && n <= b)
                break;
        }
*/
    }
}
