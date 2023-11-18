package com.burcu;

import java.util.Scanner;

public class Runner_Ornek2 {
    public static void main(String[] args) {
        /**
         * Bir sayı dizisinde en küçük 1. sayıyı, en küçük 2. sayıyı, en büyük 1. sayıyı ve en büyük 2. sayıyı bulan kod.
         */

       int [] sayilar={ 156, 32,-96,52,-3, 4,3, 85,123};
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       int max2= Integer.MIN_VALUE;
       int min2=Integer.MAX_VALUE;


        for (int i = 0; i < sayilar.length ; i++) {

            if (sayilar[i]>max){
                max2=max;
                max=sayilar[i];
            }
            else if (sayilar[i]<min){
                min2=min;
                min=sayilar[i];
            }
            else if (sayilar[i]>max2 ){
                max2=sayilar[i];
            }
            else if (sayilar[i]<min2 && sayilar[i]>min){
                min2=sayilar[i];
            }
        }
        System.out.println("En büyük sayı......: " + max);
        System.out.println("En büyük 2. sayı...: " + max2);
        System.out.println("En küçük sayı......: " + min);
        System.out.println("En küçük 2. sayı...: " + min2);

    }
}
