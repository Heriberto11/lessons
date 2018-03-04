package com.lessons.Exercices;

public class E5ChessCount {
    // Count how much weed the king have to pay considering
    // 1 -> 1, 2 -> 2, 3 -> 4, 4 -> 8, ..., x = count(x-1) * 2
    public static void main(String[] args) {
        int nsquares= 32;
        long count = 1;
        long x = 1;
        for (int i = 2; i <= nsquares; i++) {
            count = count * 2;
            x = x + count;
        }
        System.out.println(x);
    }
}



