package com.lessons;

public class Main {

    public static void main(String[] args) {
        double[] salaries = new double[]{20000, 30000, 45000};
        double[] heights = new double[]{1.80, 1.65, 1.55};

        for (int no = 0; no < 3; no++) {
            if (salaries[no] > 25000 && heights[no] > 1.60) {
                System.out.println("Rojo");
            } else {
                System.out.println("Azul");
            }
        }
    }
}







