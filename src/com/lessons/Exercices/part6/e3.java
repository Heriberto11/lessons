package com.lessons.Exercices.part6;

import java.util.Scanner;

public class e3 {/*3)	Un palíndromo es una palabra, número o frase que se lee igual haciaadelante que hacia atrás.
 Si se trata de un número, se llama capicúa. Dado un número entero N, determine si es capicúa o no.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre el numero:");
        int number = scanner.nextInt();
        int a=number/1000,b=(number%1000)/100,c=(number%100)/10,d=(number%10);
        int number2=d*1000+c*100+b*10+a;
        if(number==number2)
            System.out.println("el numero "+number+" es capicùa");
            else{
            System.out.println("el numero "+number+" no es capicùa");

        }    }
}
