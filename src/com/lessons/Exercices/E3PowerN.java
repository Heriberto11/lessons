package com.lessons.Exercices;

import java.util.Scanner;

public class E3PowerN {
    // caculate x poner n
    public static void main(String[] args) {
        int x = 3;
        int n = 3;

        int count = 1;
        for (int i = 1; i <= n; i++) {
            count = count * x;
        }

        System.out.println(count);
    }
}