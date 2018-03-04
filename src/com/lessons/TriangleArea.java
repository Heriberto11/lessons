package com.lessons;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TriangleArea {
    public static double Area(double base, double height) {
        return base * height / 2;
    }

    public static void main(String[] args) throws Exception {
        File file = new File("data\\area_in.txt");
        Scanner scanner = new Scanner(file);
        FileWriter writer = new FileWriter("data\\area_out.txt");

        while (scanner.hasNextDouble()) {
            double base = scanner.nextDouble();
            double height = scanner.nextDouble();
            double area = Area(base, height);
            writer.write(Double.toString(area));
            writer.write('\n');
        }

        scanner.close();
        writer.close();
    }
}
