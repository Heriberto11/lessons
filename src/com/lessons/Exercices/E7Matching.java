package com.lessons.Exercices;

public class E7Matching {
    // imprimir todas las parejas posibles the sexos diferentes
    public static void main(String[] args) {
        String[] names = new String[]{"pablo", "maria", "sofia", "mario", "pedro"};
        String[] sex = new String[]{"M", "F", "F", "M", "M"};
        for (int i = 0; i < names.length; i++)
            for (int j = i + 1; j < names.length; j++) {
                // if (sex[i] == "M" && sex[j] == "F" || sex[i] == "F" && sex[j] == "M")
                if (sex[i] != sex[j])
                    System.out.println(names[i] + "-----" + names[j]);
            }
    }

}