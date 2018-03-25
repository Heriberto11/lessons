package com.lessons.part5;

public class e6 {
    public static void main(String[] args) {
        //6)	Dado un número entero, mostrar todos los múltiplos de 5 comprendidos entre 1 y el número leído.
        int number = 35;

        for (int i = 1; i <= number; i++)
            if(i%5==0)
                System.out.println(i);
    }
}

