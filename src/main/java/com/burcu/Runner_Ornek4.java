package com.burcu;

import java.util.Scanner;

public class Runner_Ornek4 {
    public static void main(String[] args) {
        /**
         * Bir mağazada 200 tl, 500 tl ve 1000 tl üzeri alışverişlerde kullanıcı türüne göre farklı oranlarda indirim uygulansın,
         *
         * Premium kullanıcılar için kargo her zaman ücretsizdir.
         * Gold kullanıcılar için kargo sadece 500 tl üzerinde ücretsizdir.
         * Standart kullanıcılar için kargo sadece 1000 tl üzerinde ücretsizdir.
         *
         * Premium kullanıcılar bu zamana kadar minimum 50 alışveriş yapmış kişilerdir.
         * Gold kullanıcılar bu zamana kadar minimum 25 alışveriş yapmış kişilerdir.
         * Standart kullanıcılar 0-25 arası alışveriş yapmış kişilerdir.
         * Bu şartları sağlayan kodu yazalım.
         */

        Scanner scanner=new Scanner(System.in);

        String kullanici="";
        int kargoUCreti;

        System.out.println("Lütfen alışveriş sayınızı giriniz:");
        int alisverisSayisi= scanner.nextInt();
        System.out.println("Lütfen alışveriş tutarınızı giriniz:");
        double alisverisTutari= scanner.nextDouble();


        if (alisverisSayisi>=50){
            kullanici="Premium Kullanıcı";
            if (alisverisTutari>=1000){
                kargoUCreti=0;
                alisverisTutari=alisverisTutari-(alisverisTutari*0.4);
            } else if (alisverisTutari>=500) {
                kargoUCreti=0;
                alisverisTutari=alisverisTutari-(alisverisTutari*0.3);
            }else if (alisverisTutari>=200) {
                kargoUCreti=0;
                alisverisTutari=alisverisTutari-(alisverisTutari*0.2);
            }else {
                kargoUCreti=0;
                alisverisTutari=alisverisTutari;
            }
        }
        else if (alisverisSayisi>=25){
            kullanici="Gold Kullanıcı";
            if (alisverisTutari>=1000){
                kargoUCreti=0;
                alisverisTutari=alisverisTutari-(alisverisTutari*0.3);
            } else if (alisverisTutari>=500) {
                kargoUCreti=0;
                alisverisTutari=alisverisTutari-(alisverisTutari*0.2);
            }else if (alisverisTutari>=200) {
                kargoUCreti=20;
                alisverisTutari=alisverisTutari-(alisverisTutari*0.1)+kargoUCreti;
            }else {
                kargoUCreti=20;
                alisverisTutari=alisverisTutari+kargoUCreti;
            }
        } else if (alisverisSayisi>=0){
            kullanici="Standart Kullanıcı";
            if (alisverisTutari>=1000){
                kargoUCreti=0;
                alisverisTutari=alisverisTutari-(alisverisTutari*0.2);
            } else if (alisverisTutari>=500) {
                kargoUCreti=20;
                alisverisTutari=alisverisTutari-(alisverisTutari*0.1)+kargoUCreti;
            }else {
                kargoUCreti=20;
                alisverisTutari=alisverisTutari+kargoUCreti;
            }
        }else {
            System.out.println("Lütfen geçerli bir sayı giriniz!");
        }


        System.out.println("Kullanıcı türü: " + kullanici);
        System.out.println("Alışveriş Tutarı: " + alisverisTutari + " TL");
        System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz. Siparişinizi en kısa sürede sizlere ulaştıracağız.");
    }
}
