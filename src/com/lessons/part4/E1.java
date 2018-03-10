package com.lessons.part4;

public class E1  {

    public static void main(String[] args) {

       double consumedEnergyKW=90.000000001 , limited=90;
        if (consumedEnergyKW>limited)
            System.out.println("no cumplio, se paso de "+(consumedEnergyKW-limited)+" kW");
        else
           System.out.println("si cumplio");
    }
}

