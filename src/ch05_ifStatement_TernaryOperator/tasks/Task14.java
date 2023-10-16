package ch05_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu
          6000 den  fazla ise emekliliğini
          kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu
          7000 den  fazla ise emekliliğini
          kontrol edip kalan yıl ve prim gununu print eden code create ediniz...
         */

        Scanner input = new Scanner(System.in);
        System.out.println("cinsiyetinizi giriniz....");
        String cinsiyet = input.nextLine();
        System.out.println("yasınızı giriniz.....");
        int yas = input.nextInt();
        System.out.println("prim gnunu giriniz....");
        int prim = input.nextInt();

        if (cinsiyet.equalsIgnoreCase("kadın")) {
            if (yas >= 60 && prim >= 6000) {
                System.out.println((yas-60) + "yıldır emeklisiniz...");
            }else if (yas >= 60 && prim < 6000) {
                System.out.println("emekli olabilmek icin" + (6000-prim) + " prminiz kaldı...");
            }else if (yas < 60 && prim >= 6000) {
                System.out.println("emekli olabilmeniz icin " + (60-yas) + " yılınız kaldı....");
            }else System.out.println("emekli olabilmeniz icin " + (60-yas) + " yılınız" +
                                    " ve " + (6000-prim) + " priminiz kaldı...");
        }else if(cinsiyet.equalsIgnoreCase("erkek")) {
            if (yas >= 65 && prim >= 7000) {
                System.out.println((yas-65) + "yıldır emeklisiniz...");
            }else if (yas >= 65 && prim < 7000) {
                System.out.println("emekli olabilmek icin" + (7000-prim) + " priminiz kaldı...");
            }else if (yas < 65 && prim >= 7000) {
                System.out.println("emekli olabilmeniz icin " + (65-yas) + " yılınız kaldı....");
            }else System.out.println("emekli olabilmeniz icin " + (65-yas) + " yılınız" +
                    " ve " + (7000-prim) + " priminiz kaldı...");

        }

    }
}
