package com.lessons;

// count negatives number in the array
public class CountNegatives {

    public static void main(String[] args) {
        // loop
        double[] myList = new double[]{-1, -4, -23, 0, 44};
        int count = 0;
        for (int pos = 0; pos < myList.length; pos++) {
            if (myList[pos] < 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
