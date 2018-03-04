package com.lessons;

public class Lesson1 {
    public static void main(String[] args) {
        int x = 3;
        double y = 3.0;
        String s = "un texto";
        boolean a = true;

        // conditionals
        if (y < 0) {
            y = y * -1;
        } else {
            y = y + 1;
        }

        // loop
        int[] myList = new int[]{-1, -4, 23, 0, 44};
        int count = 0;
        for (int pos = 0; pos < myList.length; pos++) {
            if (myList[pos] < 0) {
                count = count + 1;
            }
        }

        System.out.println(count);

        // > greater-than
        // < less-than
        // == equal
        // != not equal
        // <= less-than or equal
        // >= greater-than or equal

        // + plus OR concatenation
        // - minus
        // * multiplication
        // / division
        // % modulus
        // ++ increment +1
        // -- decrement -1

        System.out.println(y);

//
//        double calc = x + 23 - 45 * (y / 23) / 44;
//        System.out.println(x / 5);
//        System.out.println(x % 5);
//        System.out.println((double)x / 5);
//        System.out.println(y / 5);
    }
}
