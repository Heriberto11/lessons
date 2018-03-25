package com.lessons.part5;

public class e2 {

    //2)El número 8833 tiene la propiedad siguiente: Si se divide en dos números de dos cifras (88 y 33)
    // y se eleva al cuadrado cada cifra, sumándolas después, se obtiene el número original (8833).
    // Haga un programa que imprima todos los números de 4 cifras que tengan ésta propiedad.
    public static void main(String[] args) {
        for(int i=1000;i<=9999;i++) {
            int twofirst = i / 100, twolast = i % 100;

            if (twofirst * twofirst + twolast * twolast == i)
                System.out.println(i);

        }
    }
}
