package com.burcu;

import java.util.Scanner;

public class Runner_Ornek3 {
    public static void main(String[] args) {
        /**
         * Bir öğrencinin sınıf geçme durumu.
         * Devamsızlık 15 ve üzeri ise ortalamaya bakılmadan direkt kalıyor .
         * Ortalama 40 altı ise de devamsızlığa bakılmadan direkt kalıyor .
         * Geçme durumu; 40 üstü ve devamsızlık 15 altı ise sınıftan geçiyor.
         * Ortalama 40-60 arası belge alamıyor, 60-80 arası teşekkür belgesi alıyor, 80-100 arası ise takdir alıyor.
         * Ortalama 100 ise hem takdir hem onur belgesi alıyor.
         * Bu şartları sağlayan kodu yazalım.
         */


        int ortalama=0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("**** ÖGRENCİ BİLGİ SİSTEMİ ****");
        System.out.println("*******************************");
        System.out.println();
        System.out.println("Lütfen 1. sınav notunu giriniz:");
        int not1=scanner.nextInt();
        System.out.println("Lütfen 2. sınav notunu giriniz:");
        int not2=scanner.nextInt();
        System.out.println("Lütfen 3. sınav notunu giriniz:");
        int not3=scanner.nextInt();
        System.out.println("Lütfen devamsızlık sayınızı giriniz:");
        int devamsizlik =scanner.nextInt();
        ortalama= (not1+not2+not3)/3;

        if (devamsizlik>=15){
            System.out.println("Devamsızlık sınırını aştınız! Sınıf tekrarı yapılacak!");
        }else if (ortalama<=40){
            System.out.println("Not ortalamanız yetersiz! Sınıf tekrarı yapılacak!");
        } else {
            System.out.println("Tebrikler sınıfı geçmek için yeterli şartları sağladınız.");
            if (ortalama<=60){
                System.out.println("Ancak Belge almaya hak kazanamadınız!");
            } else if (ortalama<=80) {
                System.out.println("Teşekkür Belgesi almaya hak kazandınız!");
            }else if (ortalama<100) {
                System.out.println("Takdir Belgesi almaya hak kazandınız!");
            }else if (ortalama==100) {
                System.out.println("Takdir Belgesi ve Onur Belgesi almaya hak kazandınız!");
            }
        }

    }
}
