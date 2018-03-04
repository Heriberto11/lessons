package com.lessons.Exercices;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class E10DiamondDetector {
    public static void main(String[] args) throws IOException {
        File file = new File("data\\E10_in.txt");
        Scanner scanner = new Scanner(file);
        FileWriter writer = new FileWriter("data\\E10_out1.txt");

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            if (a==b&&c==d){
                writer.write("its a diamond\n");
            } else {
                writer.write("no\n");
            }

        }

        scanner.close();
        writer.close();
    }
}