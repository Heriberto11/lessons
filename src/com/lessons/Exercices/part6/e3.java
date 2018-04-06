package com.lessons.Exercices.part6;

public class e3 {
    public static void main(String[] args) {
        int number=4658;
        int a=number/1000,b=(number%1000)/100,c=(number%100)/10,d=(number%10);
        int number2=d*1000+c*100+b*10+a;
        if(number==number2)
            System.out.println("el numero "+number+" es capicùa");
            else{
            System.out.println("el numero "+number+" no es capicùa");

        }    }
}
