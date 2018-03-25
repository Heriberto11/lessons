package com.lessons.part5;

public class e5 {
    public static void main(String[] args) {
        //5)	Calcular la suma de los números al cuadrado
        // en un intervalo [A,B], o sea, a*a + (a+1)*(a+1) + ... + (b-1)*(b-1) + b*b.
        int A = 3, B = 5;
        int count = 0;
        for (int i = A; i <= B; i++)
            count = count + i * i;


        System.out.println(count);


    }
}
