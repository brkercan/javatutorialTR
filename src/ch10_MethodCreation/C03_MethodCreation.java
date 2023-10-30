package ch10_MethodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void selamlama(String isim) {
        System.out.println("Selamlar..." + isim);
    }
    public static void toplama(int a, int b, int c){
        System.out.println("toplam = "+ (a+b+c) );
    }
    public static void vki(){
        Scanner input = new Scanner(System.in);
        System.out.println("boyunuzu giriniz...");
        double boy = input.nextDouble();
        System.out.println("kilonuzu giriniz...");
        double kilo = input.nextDouble();

        double vki = kilo/(boy*boy);
        System.out.println("vki = " + vki);
    }

    public static void main(String[] args) {

        selamlama("burak");
        selamlama("değerli arkadaşlar");

        System.out.println("*******************");

        toplama(3,5,7);
        toplama(345,678,987);

        vki();

    }

}
