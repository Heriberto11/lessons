package com.lessons.part5;

import java.util.Scanner;

public class e12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N:");
        int n = scanner.nextInt();

        int s = 0;
        for (int i = 0; i < n; i++) {
            int k = i * 2 + 1;
            s += k;
            System.out.print(s + " ");
        }
        System.out.println();

        s = 0;
        for (int i = 0; i < n; i++) {
            int k = i * 2 + 1;
            if (i % 2 == 0)
                s += k;
            else
                s -= k;
            System.out.print(s + " ");
        }
        System.out.println();

    }
}
