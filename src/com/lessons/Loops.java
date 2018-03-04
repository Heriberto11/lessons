package com.lessons;

public class Loops {
    public static void sampleForLoop() {
        for (int i = 0; i < 5; i++)
            System.out.println(i);

        for (int i = 0; i <= 10; i += 2)
            System.out.println(i);
    }

    public static void sampleWhileLoop() {
        double x = 100.14;
        double y = 11.2345;

        int count = 0;
        while (x >= 0) {
            x = x - y;
            count = count + 1;
        }

        System.out.println(count - 1);
    }

    public static void pairing() {
        String[] teamA = new String[] { "juan", "pedro", "jose" };
        String[] teamB = new String[] { "carlos", "manolo", "mario" };

        for (int i = 0; i < teamA.length; i++)
            for (int j = 0; j < teamB.length; j++)
                System.out.println(teamA[i] + " - " + teamB[j]);
    }

    public static void freeForAll() {
        String[] players = new String[] { "juan", "pedro", "jose", "carlos", "manolo", "mario" };

        for (int i = 0; i < players.length; i++)
            for (int j = i + 1; j < players.length; j++)
                System.out.println(players[i] + " - " + players[j]);
    }

    public static void main(String[] args) {
        // sampleForLoop();
        // sampleWhileLoop();
        // pairing();
        freeForAll();
    }
}