package com.lessons.Exercices.part6;

import java.util.Scanner;

public class e10 {/*
10)	Dado un número natural de dos cifras, réstele 1, y luego sucesivamente al valor que se va obteniendo 2, luego 3...
hasta obtener un resultado menor que 11. Imprima todos los resultados intermedios formados por los dos dígitos iguales.*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        for(int i=1;number>11;i++) {
            number=number-i;
            System.out.println(number);

        }
    }
}
