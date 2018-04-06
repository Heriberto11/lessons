package com.lessons.Exercices.part6;

import java.util.Scanner;

public class e5 {
    /*5)	Se dice que dos números “a” y “b” son “parientes” si la suma de los dígitos de a2  es igual
    a “b” y la suma de los dígitos de b2  es igual a “a”: Ejemplo: 13 y 16 son parientes pues
    . Escriba un algoritmo que determine si dos números “a” y “b” son parientes.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.print("Entre el numero:");
           int  a= scanner.nextInt();
           System.out.println("el otro numero:");
           int b=scanner.nextInt();


        int result1=a*a;
        int a1=result1/1000,b1=(result1%1000)/100,c1=(result1%100)/10,d1=(result1%10);
        int sum1=a1+b1+c1+d1;

        int result2=b*b;
        int a2=result2/1000,b2=(result2%1000)/100,c2=(result2%100)/10,d2=(result2%10);
        int sum2=a2+b2+c2+d2;

        if(sum1==b&&sum2==a)
            System.out.println("los numeros"+a+" et "+b+" son parientes");
        else{
            System.out.println("los numeros "+a+" et "+b+"no son parientes ");
        }






        }


}
