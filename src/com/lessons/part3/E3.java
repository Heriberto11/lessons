package com.lessons.part3;

public class E3 {
    public static void main(String[] args) {

        int number = 1789;
        int a = number / 1000;
        int b = (number % 1000) / 100;
        int c = (number % 100) / 10;
        int d = (number % 10);

        System.out.println("the difference between the number and the reversed number is " + Math.abs(number - d * 1000 - c * 100 - b * 10 - a));


    }
}

/*
 dado un numero de una cantidad indeterminada de cifras y la position de la cifra, imprime la cifra en esa posicion

ej:

 num = 1237498732984,  pos = 3 --> 9
 num = -28748347, pos = 6 --> 7
 */