package com.burcu;

import java.util.Scanner;

public class Runner_Ornek7 {
    public static void main(String[] args) {
        /**
         * Bir sinema salonu
         * Film isimlerini ekrana yazdıralım.(Avatar, Atatürk 1881, Shrek4, ...)
         * Film saatlerini ve kullanıcının yaşına göre girebileceği filmleri yazdıralım.
         * Kullanıcı eğer yaşının üstünde bir film seçerse "üzgünüz .. yaş ve üzeri için geçerlidir" gibi çıktı verelim.
         */

        System.out.println("******************************");
        System.out.println("**** SİNEMA BİLGİ SİSTEMİ ****");
        System.out.println("******************************");
        System.out.println();

        System.out.println("**** Vizyondaki Filmler ****");
        System.out.println();
        System.out.println("1- Atatürk 1881-1919");
        System.out.println("2- Testere X");
        System.out.println("3- Aslan Hürkuş 3: Anka Adası");
        System.out.println("0- Çıkış ");


        int secim=0, secim2=0, yas=0;

        do {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Lütfen izlemek istediğiniz filmi seçiniz.");
            secim= scanner.nextInt();
            System.out.println("Lütfen yaşınızı giriniz.");
            yas= scanner.nextInt();

            if (secim==1 && yas>=6){
                System.out.println("Seans saatleri:");
                System.out.println();
                System.out.println("1- 17:00");
                System.out.println("2- 19:00");
                System.out.println("3- 21:00");
                System.out.println();
                System.out.println("Lütfen girmek istediğiniz seans saatini seçiniz:");
                secim2= scanner.nextInt();
                System.out.println("Atatürk 1881-1919 filmi için biletiniz hazırlanmıştır. Ödeme için kasaya gidiniz...");

            } else if (secim==1 ) {
                System.out.println("Üzgünüz yaşınız filmi izlemek için yeterli değildir.");

            } else if (secim==2 && yas>=18) {
                System.out.println("Seans saatleri:");
                System.out.println();
                System.out.println("1- 18:00");
                System.out.println("2- 22:00");
                System.out.println();
                System.out.println("Lütfen girmek istediğiniz seans saatini seçiniz:");
                secim2= scanner.nextInt();
                System.out.println("Testere X filmi için biletiniz hazırlanmıştır. Ödeme için kasaya gidiniz...");

            }else if (secim==2 ) {
                System.out.println("Üzgünüz yaşınız filmi izlemek için yeterli değildir.");

            }else if (secim==3) {
                System.out.println("Seans saatleri:");
                System.out.println();
                System.out.println("1- 13:00");
                System.out.println("2- 16:00");
                System.out.println();
                System.out.println("Lütfen girmek istediğiniz seans saatini seçiniz:");
                secim2= scanner.nextInt();
                System.out.println("Aslan Hürkuş 3: Anka Adası filmi için biletiniz hazırlanmıştır. Ödeme için kasaya gidiniz...");

            }else {
                System.out.println("Lütfen geçerli seçim yapınız.");
            }


        }while (secim>3 || secim<0);





    }
}
