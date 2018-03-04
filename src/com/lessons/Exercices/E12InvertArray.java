package com.lessons.Exercices;

public class E12InvertArray {
    // invert the order of the words inside the list
    public static void main(String[] args) {
        String[] list = new String[]{"one", "two", "three", "go", "now"};
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}
