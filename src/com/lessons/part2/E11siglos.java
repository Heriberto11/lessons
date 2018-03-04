package com.lessons.part2;

public class E11siglos {
    public static void main(String[] args) {


        double year=1701;
        double siglo=year/100;


        System.out.println(year + " esta en el siglo " +Math.ceil (siglo));


        int year1 = 1701;
        int century = year1 / 100;
        if (year1 % 100 > 0)
            century++;

        System.out.println(year1 + " esta en el siglo " + century);

    }
}
