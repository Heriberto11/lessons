package com.lessons.Exercices.part6;

import java.util.Scanner;

public class e6 {
    /*6)	Escriba un algoritmo que determine siun dígito “d” está en un número entero N.
     Por ejemplo, si N=3567, el dígito 5 está y el dígito 4 no está.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre el numero:");
        int a = scanner.nextInt();
        System.out.println("Entre el digito:");
        int b = scanner.nextInt();
        int a1 = a/ 1000, b1 = (a % 1000) / 100, c1 = (a % 100) / 10, d1 = (a % 10);
        if(a==b||b1==b||c1==b||d1==b)
            System.out.println("the digit is in the number");
        else{
            System.out.println("the digit isn't in the number");
        }

    }
}

