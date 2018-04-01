package com.lessons.part5;

public class e14 {
    public static void main(String[] args) {
        int a = 12, b = 90;
        int smaller = (a < b) ? a : b;
        for (int i = smaller;i>=1; i--)
            if (b % i == 0 && a % i == 0)
                System.out.println(i);

    }
}
