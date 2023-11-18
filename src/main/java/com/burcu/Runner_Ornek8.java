package com.burcu;


import java.util.Scanner;

public class Runner_Ornek8 {
    public static void main(String[] args) {
        /**
         * Girilen sayı hem 2 ile hem de 3 ile tam bölünebiliyorsa “2 ve 3’ün katı”,
         * sadece 2 ile bölünebiliyorsa “2’nin katı”,
         * sadece 3 ile bölünebiliyorsa “3’ün katı”,
         * ne 2’ye ne de 3’e bölünmüyorsa “2 veya 3’ün katı değil” mesajı veren program
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi=scanner.nextInt();

        if (sayi%2==0 && sayi%3==0){
            System.out.println("2 ve 3'ün katıdır.");
        } else if (sayi%2==0) {
            System.out.println("2'nin katıdır.");
        }else if (sayi%3==0) {
            System.out.println("3'ün katıdır.");
        }else if (sayi%2!=0 && sayi%3!=0) {
            System.out.println("2 veya 3ün katı değildir.");
        }

    }
}
