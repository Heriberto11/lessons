package com.lessons.part5;

public class e9 {
    public static void main(String[] args) {
        //9)Confeccione un programa para imprimir todos los números de tres cifras
        // que tienen como incluido un número n.
        int number=6;
        for (int i = 100; i <= 999; i++) {
            int d3 = i % 10,d2 = i / 10 % 10,d1= i / 100;
            if(d3==number||d2==number||d1==number)
                System.out.println(i);
        }
    }
}