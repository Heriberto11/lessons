package com.lessons.part5;

public class e8 {
    public static void main(String[] args) {
        //8)	Confeccione un programa que imprima todos los números de tres cifras divisibles por cinco,
        // tales que la suma de sus dígitos sea 12.

        for (int i = 100; i <= 999; i++) {
            int d3 = i % 10;
            int d2 = i / 10 % 10;
            int d1 = i / 100;

            if (i % 5 == 0 && d3+d2+d1==12)
                System.out.println(i);


        }
    }
}