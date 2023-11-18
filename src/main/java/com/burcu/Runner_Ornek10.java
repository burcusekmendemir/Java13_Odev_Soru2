package com.burcu;

public class Runner_Ornek10 {
    public static void main(String[] args) {
        /**
         * 1 ile 300 arasındaki  asal sayıları yazdıralım.
         */

        int sayac=0;
        for (int i = 2; i <=300 ; i++) {
            boolean asalMi=true;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    asalMi=false;
                    break;
                }
            }
            if (asalMi){
                System.out.println(i);
                sayac++;
            }

        }
    }
}
