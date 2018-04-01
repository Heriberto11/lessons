package com.lessons.part5;

public class e13 {
    //13)	Confeccione un programa para leer un número entero y positivo e  imprimir todos sus divisores.

    public static void main(String[] args) {

        int number=30;
        for(int i =1;i<=number;i++)
            if(number%i==0)
                System.out.println(i);
    }
}
