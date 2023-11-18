package com.burcu;

import java.util.Scanner;

public class Runner_Ornek1 {
    public static void main(String[] args) {

        /**
         * Kullanıcı tarafından girilen üç sayıdan en büyük ile en küçük sayıyı toplayıp,
         * toplam sonucu ekrana yazdıran kod.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz:");
        int s1=scanner.nextInt();
        System.out.println("Lütfen 2. sayıyı giriniz:");
        int s2=scanner.nextInt();
        System.out.println("Lütfen 3. sayıyı giriniz:");
        int s3=scanner.nextInt();

        int enbuyuk = 0, enkucuk=0, toplam=0;

        if (s1>s2 && s1>s3){
            enbuyuk=s1;
        } else if (s2>s3 && s2>s1) {
            enbuyuk=s2;
        }else if (s3>s2 && s3>s1){
            enbuyuk=s3;
        }
        if (s1<s2 && s1<s3){
            enkucuk=s1;
        } else if (s2<s3 && s2<s1) {
            enkucuk=s2;
        }else if (s3<s2 && s3<s1){
            enkucuk=s3;
        }
        toplam=enbuyuk+enkucuk;
        System.out.println("En büyük sayı: " + enbuyuk);
        System.out.println("En küçük sayı: " + enkucuk);
        System.out.println("En büyük ve en küçük sayı toplamı: " + toplam);






    }
}
