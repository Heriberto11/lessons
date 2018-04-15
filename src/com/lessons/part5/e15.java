package com.lessons.part5;

import java.util.Scanner;

public class e15 {
    /*15)	Determinar si un número es primo. Se llama número primo a todo aquel número que
     tiene como divisores a la unidad y al propio número.*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number: ");
        int number=scanner.nextInt();
        if(number%2!=0&&number%3!=0&&number%5!=0&&number%7!=0&&number%11!=0)
        System.out.println("el numero es un numero primo");
        else
            System.out.println("el numero no es un numero primo");

    }
}
