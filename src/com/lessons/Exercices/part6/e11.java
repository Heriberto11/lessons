package com.lessons.Exercices.part6;

import java.util.Scanner;

public class e11 {
    /*11)	Lista a 9. Comience con un número de dos dígitos, digamos el 19. Invierta los dígitos para obtener el 91,
 tomar la diferencia entre 91 y 19 para obtener el próximo número de la lista 72 = 91 - 19. Repita este proceso con
 el 72 para obtener el próximo número 45 = 72 - 27. Una repetición más del mismo proceso  produciría 9 = 54 - 45. La
lista a 9 es: 19 72 45 9  Longitud de la lista es 4. Genere utilizando el procedimiento arriba descrito la lista a
9 para un número entrado.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entre un numero de dos chifras que contenga un 9: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 4; i++) {
            int digit1A = number / 10, digit2A = number % 10;
            int secondNumber = digit2A * 10 + digit1A;
            number = Math.abs(number - secondNumber);
            System.out.println(number);
            if (number == 9)
                break;


        }
    }
}
