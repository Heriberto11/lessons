package com.lessons.part2;

public class E10distanciaManiatan {
    public static void main(String[] args) {
        //La distancia entre dos puntos con coordenadas enteras en una hoja cuadriculada
        // se  calcula  por  la  fórmula  de  la  distancia  maniatan:
        // Dm = |x1-x2| + |y1-y2|. Dadas las coordenadas de dos puntos calcule la distancia entre ellos.
        int x1 = 4;
        int y1 = 4;
        int x2 = 0;
        int y2 = 7;
        int distancia = Math.abs(x1 - x2) + Math.abs(y1 - y2);

        System.out.println(distancia);


    }
}
