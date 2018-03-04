package com.lessons.Exercices;

public class E4SelectPlayer {
    public static void main(String[] args) {
        String[] players = new String[]{"juan", "pedro", "jose", "mario"};
        int number = 2; // modificar para que acepte numeros negativos
         String stay = players[number % 4];
         System.out.println(stay);


    }
}
