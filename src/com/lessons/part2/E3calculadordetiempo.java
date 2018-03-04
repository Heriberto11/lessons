package com.lessons.part2;

public class E3calculadordetiempo {

    public static int totalMinutos(int hora, int minutos) {
        return hora * 60 + minutos;
    }

    public static void main(String[] args) {
        // comienza 10:10 termina 15:01
        // comienza 15:01 termina 10:10 +1
        // comienza 10:20 termina 10:01 +1
        // comienza 10:03 termina 10:20

        int hora1 = 10;
        int minutos1 = 20;

        int hora2 = 10;
        int minutos2 = 29;

        int cuenta = totalMinutos(hora2, minutos2) - totalMinutos(hora1, minutos1);

        if (hora2 < hora1 || (hora2 == hora1 && minutos2 < minutos1)) {
            cuenta += 1440;
        }

        System.out.println(cuenta + " minutos");
    }
}

