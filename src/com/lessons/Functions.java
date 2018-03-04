package com.lessons;

public class Functions {
    public static double XPower3(double x) {
        return x*x*x;
    }

    public static void main(String[] args) {
        System.out.println(XPower3(2));
        System.out.println(XPower3(3));
        System.out.println(XPower3(3 + 2));
    }
}
