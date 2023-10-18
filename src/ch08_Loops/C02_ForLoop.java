package ch08_Loops;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        // Task-> girilen sayıdan 100 e kadar olan 4 ün katı olan

        Scanner input = new Scanner(System.in);
        System.out.println("100 den küçük bir sayı giriniz");
        int sayı = input.nextInt();

        if (sayı<100) {
            for (int i = sayı; i < 100; i++) {
                if (i % 4 == 0) {
                    System.out.print(i + " ");
                }
            }
        }else System.out.println("100 den küçük değer giriniz..");
    }
}
