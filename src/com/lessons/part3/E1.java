package com.lessons.part3;

public class E1 {

    public static void main(String[] args) {

        int number = 980;
        int a = number / 100;
        int b = (number % 100) / 10;
        int c = (number % 10);

        System.out.println(a * 10 + b + c);
    }
}

//