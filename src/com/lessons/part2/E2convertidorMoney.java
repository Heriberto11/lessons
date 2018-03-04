package com.lessons.part2;

public class E2convertidorMoney {

    public static void main(String[] args) {


        double tasacambio = 1.3;
        // 1 - express money including the cents
        // 2 - round the conversion to 2 decimals.
        // read about different rounding methods

        double dinerocad = 300;
        System.out.println((dinerocad + " dollares canadiences son ") + (dinerocad / tasacambio + "dollares americanos"));

    }


}