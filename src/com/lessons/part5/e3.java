package com.lessons.part5;

public class e3 {
    //3)Obtener todos los números enteros positivos de cuatro cifras que cumplan la propiedad que tiene
    // el siguiente ejemplo: el número 3025, si lo separamos en dos números de dos dígitos cada uno, 30 y 25,
    // se suman dichos números y luego se elevan al cuadrado el resultado final es 3025. Es decir: (30 + 25)^2 = (55)^2 = 3025.
    public static void main(String[] args) {
        for (int i = 1000; i <=9999; i++) {
            int twofist = i / 100, twolast = i % 100;
            int sum = twofist + twolast;
            if (sum * sum == i) {
                System.out.println(i);
            }
        }
    }
}