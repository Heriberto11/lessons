package com.lessons.part5;

public class e11 {
    public static void main(String[] args) {
        //11)	Encuentre todos los números de dos cifras cuya diferencia del número
        // con sus dígitos invertidos sea igual a 9.


        for (int i = 10; i <= 99; i++) {
            int n1=i/10,n2=i%10;
            int newnumber=n2*10+n1;
            if(Math.abs(i-newnumber)==9)
                System.out.println(i);



        }
    }
}