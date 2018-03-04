package com.lessons;

public class SelectPlayer {
    public static void main(String[] args) {
        String[] players = new String[] {"juan", "pedro", "jose", "mario"};
        int number = 3; // modificar para que acepte numeros negativos
        String stay = players[number % players.length
                ];
        System.out.println(stay);
             }
             }
