package com.lessons;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileInputOutput {
    public static void readExample() throws Exception {
        File file = new File("data\\input.txt");
        Scanner scanner = new Scanner(file);

        String s = scanner.nextLine();
        int i1 = scanner.nextInt();
        double d1 = scanner.nextDouble();

        scanner.close();
    }

    public static void writeExample() throws Exception {
        FileWriter writer = new FileWriter("data\\output.txt");

        String s = "one line of text";
        int i1 = 23;
        double d1 = 40.5;

        writer.write(s);
        writer.write('\n');
        writer.write(Integer.toString(i1));
        writer.write('\n');
        writer.write(Double.toString(d1));
        writer.write('\n');

        writer.close();
    }

    public static void main(String[] args) throws Exception {
        readExample();
        writeExample();
    }
}
