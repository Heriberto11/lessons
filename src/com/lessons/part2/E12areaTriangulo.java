package com.lessons.part2;

public class E12areaTriangulo {
    public static void main(String[] args) {
        //12)	Calcular el área de un triángulo conociendo las longitudes de sus lados.
        // Para ello se debe auxiliar de las respectivas fórmulas para  el semiperímetro (P)
        // y el área triángulo (A).

        int lado1 = 22;
        int lado2 = 21;
        int lado3 = 23;
        double semiperimetro = (lado1 + lado2 + lado3) / 2.0;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

        System.out.println(Math.round(area * 100) / 100.0 + " es el area del triangulo\n" + semiperimetro + " es el semiperimetro del triangulo");

    }
}
