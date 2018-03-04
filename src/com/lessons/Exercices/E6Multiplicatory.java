package com.lessons.Exercices;

public class E6Multiplicatory {
    // calculate the product of the scores in the list.
    public static void main(String[] args) {
        double[] scores = new double[]{7.5, 8, 10, 6, 7.4, 8.3};
        double count = 1;

        for (int pos = 0; pos < scores.length; pos++) {
            count = count * scores[pos];

        }


        System.out.println(count);
    }


}
