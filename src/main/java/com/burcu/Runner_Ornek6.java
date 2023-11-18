package com.burcu;

import java.util.Scanner;

public class Runner_Ornek6 {
    public static void main(String[] args) {
        /**
         * Bir öğrenci için; okul öncesi eğitim 75.000 tl, ilkokul eğiitm ücreti  100.000 tl,
         * ortaokul ücreti 120.000 tl, lise ücreti de 150.000 tl olsun.
         * Öğrenci notuna göre burs hakkı kazansın.
         * Eğer 50 puanın altında alırsa "Burs kazanamadınız çıktısı versin"
         * Ayrıca burslu ve burssuz eğitim ücretlerini de yazdıralım.
         */


        System.out.println("********************************");
        System.out.println("**** BURS HESAPLAMA SİSTEMİ ****");
        System.out.println("********************************");
        System.out.println();

        System.out.println(" 1- Okul Öncesi Eğitim ");
        System.out.println(" 2- İlköğretim ");
        System.out.println(" 3- Ortaöğretim ");
        System.out.println(" 4- Lise Eğitim ");
        System.out.println(" 0- Çıkış ");

        int secim=0, yas=0;
        double ucretOkulOncesi=75_000;
        double ucretIlkogretim=100_000;
        double ucretOrtaogretim=120_000;
        double ucretLise=150_000;

        do {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Lütfen hesaplama yapmak istediğiniz eğitim öğretim dönemi için seçim yapınız:");
            secim=scanner.nextInt();

            if (secim==1){
                System.out.println("Okul Öncesi Eğitim sistemine hoşgeldiniz!!");
                System.out.println("Lütfen eğitim alacak öğrencinin yaşını giriniz:");
                yas=scanner.nextInt();

                if (yas>=1 && yas<3){
                    System.out.println("1. derece eğitim alanına sahipsiniz.");
                    ucretOkulOncesi=ucretOkulOncesi-(ucretOkulOncesi*0.15);
                    System.out.println("Sizler için İndirimli eğitim ücretimiz: " + ucretOkulOncesi);
                } else if (yas>=3 && yas<5) {
                    System.out.println("2. derece eğitim alanına sahipsiniz. Eğitim ücreti: " + ucretOkulOncesi);
                }
            }
            else if (secim==2){
                System.out.println("İlköğretim sistemine hoşgeldiniz!!");
                System.out.println("Lütfen notunuzu giriniz:");
                int ogrenciNotu= scanner.nextInt();

                if (ogrenciNotu>=70 && ogrenciNotu<85){
                    System.out.println("Tebrikler %25 burs kazandınız!");
                    ucretIlkogretim=ucretIlkogretim-(ucretIlkogretim*0.25);
                    System.out.println("Sizler için İndirimli eğitim ücretimiz: " + ucretIlkogretim);
                }else if (ogrenciNotu>=85 && ogrenciNotu<=100){
                    System.out.println("Tebrikler %50 burs kazandınız!");
                    ucretIlkogretim=ucretIlkogretim-(ucretIlkogretim*0.5);
                    System.out.println("Sizler için İndirimli eğitim ücretimiz: " + ucretIlkogretim);
                }else {
                    System.out.println("Üzgünüz burs kazanamadınız!");
                    System.out.println("İndirimsiz eğitim ücretimiz: " + ucretIlkogretim);
                }

            }else if (secim==3){
                System.out.println("Ortaöğretim sistemine hoşgeldiniz!!");
                System.out.println("Lütfen notunuzu giriniz:");
                int ogrenciNotu= scanner.nextInt();

                if (ogrenciNotu>=70 && ogrenciNotu<85){
                    System.out.println("Tebrikler %35 burs kazandınız!");
                    ucretOrtaogretim=ucretOrtaogretim-(ucretOrtaogretim*0.35);
                    System.out.println("Sizler için İndirimli eğitim ücretimiz: " + ucretOrtaogretim);
                }else if (ogrenciNotu>=85 && ogrenciNotu<=100){
                    System.out.println("Tebrikler %65 burs kazandınız!");
                    ucretOrtaogretim=ucretOrtaogretim-(ucretOrtaogretim*0.65);
                    System.out.println("Sizler için İndirimli eğitim ücretimiz: " + ucretOrtaogretim);
                }else {
                    System.out.println("Üzgünüz burs kazanamadınız!");
                    System.out.println("İndirimsiz eğitim ücretimiz: " + ucretOrtaogretim);
                }

            }else if (secim==4){
                System.out.println("Lise Eğitim sistemine hoşgeldiniz!!");
                System.out.println("Lütfen notunuzu giriniz:");
                int ogrenciNotu= scanner.nextInt();

                if (ogrenciNotu>=70 && ogrenciNotu<85){
                    System.out.println("Tebrikler %45 burs kazandınız!");
                    ucretLise=ucretLise-(ucretLise*0.45);
                    System.out.println("Sizler için İndirimli eğitim ücretimiz: " + ucretLise);
                }else if (ogrenciNotu>=85 && ogrenciNotu<=100){
                    System.out.println("Tebrikler %65 burs kazandınız!");
                    ucretLise=ucretLise-(ucretLise*0.75);
                    System.out.println("Sizler için İndirimli eğitim ücretimiz: " + ucretLise);
                }else {
                    System.out.println("Üzgünüz burs kazanamadınız!");
                    System.out.println("İndirimsiz eğitim ücretimiz: " + ucretLise);
                }

            }else if (secim==0){
                System.out.println("Çıkış yapılıyor..");

            }else {
                System.out.println("Geçerli bir seçim yapınız.");
            }

        }while (secim>4 || secim<=0);
    }
}
