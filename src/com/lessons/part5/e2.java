package com.lessons.part5;

public class e2 {
    public static void main(String[] args) {
        for(int i=1000;i<=9999;i++) {
            int twofirst = i / 100, twolast = i % 100;

            if (twofirst * twofirst + twolast * twolast == i)
                System.out.println(i);

        }
    }
}
