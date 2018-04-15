package com.lessons.Exercices.part6;

import java.util.Scanner;

public class e13 {/*13)	Dado un número del que no conocemos la cantidad de dígitos que posee, determinar si es divisible
por 3.Un número es divisible por 3 si la suma de sus cifras es un múltiplo de tres.*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number: ");
        int number= scanner.nextInt();
         int d1=number/1000000000;
         int d2=(number%1000000000)/100000000;
         int d3=(number%100000000)/10000000;
         int d4=(number%10000000)/1000000;
         int d5=(number%1000000)/100000;
         int d6=(number%100000)/10000;
         int d7=(number%10000)/1000;
         int d8=(number%1000)/100;
         int d9=(number%100)/10;
         int d10=number%10;
         if((d1+d2+d3+d4+d5+d6+d7+d8+d9+d10)%3==0)
             System.out.println("the number is divisible by 3");
         else
             System.out.println("the number isn't divisible by 3");


    }
}
