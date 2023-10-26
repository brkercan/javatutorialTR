package ch09_Loops.ForLoop.Tasks;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı = input.nextInt();
        int bolenSayısı = 0;

        for (int i = 2; i < sayı; i++) {
            if(sayı%i == 0) {      // bolenSayısı = (sayı%i ==0) ? bolenSayısı++ : bolenSayısı;
                bolenSayısı++;
            }
        }
        System.out.println(bolenSayısı == 0 ? "girilen sayı ASAL" : "girilen sayı ASAL DEĞİL");


    }
}
