package com.lessons.part3;

public class E2timing {
    public static void main(String[] args) {

        int seconds = 20000;
        int secondsRemaining = seconds % 60;
        int minutes = seconds / 60;
        int minutesremaining = minutes % 60;
        int hours = minutes / 60;


        System.out.println("seconds " + secondsRemaining);
        System.out.println("minutes " + minutesremaining);
        System.out.println("hours " + hours);


    }
}
