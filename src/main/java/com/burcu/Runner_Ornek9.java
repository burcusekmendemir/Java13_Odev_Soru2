package com.burcu;

import java.util.Scanner;

public class Runner_Ornek9 {
    public static void main(String[] args) {
        /**
         * Toplu taşımada kart türüne ve aktarma bilgisi koşullarına göre ekrana bakiye bilgisi veren kodu yazalım.
         */

        Scanner scanner=new Scanner(System.in);
        double ucret=0;

        System.out.println("1-Tam");
        System.out.println("2-Öğrenci");
        System.out.println("3-Sosyal");

        System.out.println("Lütfen bir kullanıcı türü giriniz:");
        int kullanici=scanner.nextInt();

        System.out.println("0-İlk Basım");
        System.out.println("1-1.Aktarma");
        System.out.println("2-2.Aktarma");

        System.out.println("Lütfen aktarma seçiniz:");
        int aktarma = scanner.nextInt();

        System.out.println("Lütfen bakiyenizi giriniz:");
        double kartBakiye=scanner.nextDouble();

        if (kullanici==1){
            if (aktarma==0){
                ucret=15.0;
            } else if (aktarma==1) {
                ucret=12.42;
            } else if (aktarma==2) {
                ucret=9.48;
            }else {
                ucret=0;
                System.out.println("Hatalı Giriş");
            }
        }

        if (kullanici==2){
            if (aktarma==0){
                ucret=10.0;
            } else if (aktarma==1) {
                ucret=8.21;
            } else if (aktarma==2) {
                ucret=6.25;
            }else {
                ucret=0;
                System.out.println("Hatalı Giriş");
            }
        }
        if (kullanici==3){
            if (aktarma==0){
                ucret=12.0;
            } else if (aktarma==1) {
                ucret=9.32;
            } else if (aktarma==2) {
                ucret=7.5;
            }else {
                ucret=0;
                System.out.println("Hatalı Giriş");
            }
        }

        if (ucret<=kartBakiye){
            kartBakiye-=ucret;
            System.out.println("Kalan bakiyeniz: " + kartBakiye);
        }else {
            System.out.println("Yetersiz Bakiye!!!");
        }







    }
}
