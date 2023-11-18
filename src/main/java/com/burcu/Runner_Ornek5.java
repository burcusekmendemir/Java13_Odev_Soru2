package com.burcu;

import java.util.Scanner;

public class Runner_Ornek5 {
    public static void main(String[] args) {
        /**
         * Bir sinema salonu.
         * Tam, öğrenci, öğretmen için ücretleri yazalım.
         * Eğer öğretmense 100 tl, Öğrenci ise 80 tl, Tam 120 tl bilet fiyatı yazdıralım
         */

        System.out.println("******************************");
        System.out.println("**** SİNEMA BİLGİ SİSTEMİ ****");
        System.out.println("******************************");
        System.out.println();
        System.out.println(" 1- Öğrenci ");
        System.out.println(" 2- Öğretmen ");
        System.out.println(" 3- Tam ");
        System.out.println(" 0- Çıkış ");

        int secim=0;

       do {
           Scanner scanner=new Scanner(System.in);
           System.out.println("Lütfen izleyici seçimi yapınız:");
          secim=scanner.nextInt();

           if (secim==1){
               System.out.println("Öğrenci için bilet fiyatı 80 Tl'dir.");
           }else if (secim==2){
               System.out.println("Öğretmen için bilet fiyatı 100 Tl'dir.");
           }else if (secim==3){
               System.out.println("Tam için bilet fiyatı 120 Tl'dir.");
           }else if (secim==0){
               System.out.println("Çıkış yapılıyor..");
           }else {
               System.out.println("Geçerli bir seçim yapınız.");
           }

       }while (secim>3 || secim<=0);


    }
}
