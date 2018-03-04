package com.lessons.part2;

public class E14 {
    public static void main(String[] args) {

        int x = 1;
        int y = 22;
        x = x + y;
        y = x - y;
        x = x - y;


        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}