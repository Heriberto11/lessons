package com.lessons.part2;

public class E7electricidad {
    public static void main(String[] args) {
        //Una familia en su casa gasta entre 100 y 150 kw al mes. Conocida la cantidad de kw gastados
        // por dicha familia, qué cantidad de dinero deben pagar. Con la tarifa se pagan
        // nueve pesos por los 100 primeros Kw. consumidos y 30 centavos por cada uno de los restantes kw.

        // que tal si la familia sale de vacaciones y ese mes gasta menos de 100 kw

        double cantidadkw = 101;
        if (cantidadkw<=100) {
            System.out.println(9 + " pesos la famila tiene que pagar por la E7electricidad");
        }else {
            double costos = (cantidadkw - 100) * .30;

            System.out.println(costos + 9 + " pesos la famila tiene que pagar por la E7electricidad");
        }



    }
}
