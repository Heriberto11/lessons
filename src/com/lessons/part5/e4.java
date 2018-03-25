package com.lessons.part5;

public class e4 {
    public static void main(String[] args) {
        //4)	Calcule el promedio de todos los números pares menores que M.
        int m = 99999;
        int numbers = 0, count = 0;
        for (int i = m-1; i>=1;i--)
            if (i % 2 == 0) {
                numbers = numbers + 1;
                count = count + i;

            }System.out.println(count/numbers);

    }

}