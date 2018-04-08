package com.lessons.Exercices.part6;

public class e1 {
    /*1Confeccione un programa para determinar cuál fue el
     mejor y cuál fue el peor de una lista indeterminada de saltos realizados por
     un atleta en una competencia. Cada salto se evalúa con un número distinto de cero. */
    public static void main(String[] args) {
        double[] scores = new double[]{7.5, 8, 10, 6, 7.4, 8.3};
        double max = scores[0];
        double min = scores[0];
        for (int i = 1; i <= scores.length - 1; i++) {
            if (max < scores[i])
                max = scores[i];
            if (min > scores[i])
                min = scores[i];
        }
        System.out.println("the best jump in the list is " + max);
        System.out.println("the worst jump in the list is " + min);

    }


}


