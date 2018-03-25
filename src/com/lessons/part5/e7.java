package com.lessons.part5;

public class e7 {
    public static void main(String[] args) {
        //7)Dado dos números que representan un intervalo,
        // mostrar todos los números terminados en 4 comprendidos en dicho intervalo.
        int A=4,B=17866;
        for(int i=A;i<=B;i++)
            if(i%10%10%10%10%10%10%10==4)
                System.out.println(i);
    }
}
