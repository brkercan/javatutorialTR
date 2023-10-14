package ch07StringManipulation;

import java.util.Scanner;

public class C04_contains {
    public static void main(String[] args) {

        /*
         String iersinde istenen stringini varlığını kontrol eder boolean değer return eder..
         char parametre --> CTE
         */

        String str1 = "Başarı gayrete aşıktır :)";
        System.out.println(str1);

        System.out.println("str1.contains(\"Başarı\") = " + str1.contains("Başarı"));  // True
        System.out.println("str1.contains(\"a\") = " + str1.contains("a")); // True
        System.out.println("str1.contains(\"haluk\") = " + str1.contains("haluk")); // False

        Scanner input = new Scanner(System.in);
        System.out.println("bir metin giriniz...");
        String metin = input.nextLine();

        System.out.println("aradıgınız kelimeyi giriniz...");
        String kelime = input.nextLine();

        System.out.println("metin.contains(kelime) = " + metin.contains(kelime));

        System.out.println(metin.contains(kelime) ? "girilen kelime metinde var" : "girilen kelime metinde yok");




    }
}
