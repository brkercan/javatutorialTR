package ch10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void selamlama(){
        System.out.println("merhaba nasılsınız...");
        System.out.println("selamlar...");
    }
    public static void faktoriyel(){
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz...");
        int sayı = input.nextInt();

        int faktoriyel = 1;

        while(sayı>1){
            faktoriyel *= sayı;
            sayı--;
        }
        System.out.println("faktoriyel = " + faktoriyel);

    }
    public static void main(String[] args) {
        selamlama();

        faktoriyel();
        faktoriyel();




    }
}
