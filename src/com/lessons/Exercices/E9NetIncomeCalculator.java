package com.lessons.Exercices;

import java.util.Arrays;

public class E9NetIncomeCalculator {
    // given the rules of exercise 2, print the name and the net salary.
    // michelgb@gmail.com
    public static void main(String[] args) {
        String[] employees = new String[]{"juan", "pedro", "mario", "carlos", "maria"};
        double[] salaries = new double[]{50000, 33000, 25000, 130000, 55000};


        for (int i = 0; i < 5; i++) {

            double bracket1 = 45916 * 0.15;
            double bracket2 = bracket1 + 45915 * 0.205;
            double bracket3 = bracket2 + 50522 * 0.26;
            double bracket4 = bracket3 + 60447 * 29;

            if (salaries[i] <= 45916)
                System.out.printf("%.2f ---- %s\n",salaries[i] * 0.85, employees[i]);
            if (salaries[i] > 45916 && salaries[i] <= 91831)
                System.out.printf("%.2f ---- %s\n", salaries[i] - (bracket1 + (salaries[i] - 45916) * 0.205), employees[i]);
            if (salaries[i] > 91831 && salaries[i] <= 142353)
                System.out.printf("%.2f ---- %s\n", salaries[i] - (bracket2 + (salaries[i] - 91831) * 0.26), employees[i]);
            if (salaries[i] > 142353 && salaries[i] <= 202800)
                System.out.printf("%.2f ---- %s\n", salaries[i] - (bracket3 + (salaries[i] - 142353) * 0.29), employees[i]);
            if (salaries[i] > 202800)
                System.out.printf("%.2f ---- %s\n", salaries[i] - (bracket4 + (salaries[i] - 202800) * 0.33), employees[i]);
        }
    }
}


