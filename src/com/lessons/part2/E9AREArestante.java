package com.lessons.part2;

public class E9AREArestante {
    public static void main(String[] args) {
        //RECTANGULO GRANDE
        double lado1 = 20;
        double lado2 = 10;
        //RECTAGULO PEQUENO
        double lado3 = 3;
        double lado4 = 5;
        //AREAS
        double areagrande = lado1 * lado2;
        double areachica = lado3 * lado4;

        System.out.println("el espacio restante es de " + (areagrande - areachica));


    }
}

