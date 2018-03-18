package com.lessons.part5;

public class E1cubosnarcicista {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int d3 = i % 10;
            int d2 = i / 10 % 10;
            int d1 = i / 100;

            if (d1*d1*d1 + d2*d2*d2 + d3*d3*d3 == i)
                System.out.println(i);
        }
    }
}
