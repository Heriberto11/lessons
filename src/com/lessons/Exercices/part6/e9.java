package com.lessons.Exercices.part6;

import java.util.Scanner;

public class e9 {
    public static void main(String[] args) {
        /*9)	Escribir un programa que muestre una salida con la siguiente secuencia numérica: 1, 5, 3, 7, 5, 9, 7,…, 23.
        La secuencia debe detenerse al llegar al valor de V ó sobrepasarlo.
         La secuencia se obtiene partiendo de 1 y sumando y restando 4 y 2, alternativamente.*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("entre el numero:");
        int number=scanner.nextInt();
        int suma=1;
        for(int i=1;suma<=number;i++) {
            System.out.println(suma + ",");
            suma+=4;
            System.out.println(suma+",");
            suma-=2;


        }

    }

}
