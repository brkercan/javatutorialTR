package ch07StringManipulation;

import java.util.Scanner;

public class C02_Length {
    public static void main(String[] args) {
        /*
        length() methodu girilen string'in uzunluğunu:içinde bulunan
        karakter sayısını return(döndurur :verir ) eder
        butun karakterleri(boşluk vs) sayıp adedini verir.
        */

        String str1 = "bahanesi olanın basarısı olmazzzz :( ";
        System.out.println("str1.length() = " + str1.length());

        String str2 = " ";
        String str3 = "";
        String str4 = null;

        System.out.println("str2.length() = " + str2.length());
        System.out.println("str3.length() = " + str3.length());
        // System.out.println("str4.length() = " + str4.length());  // RTE alırız...

        /*
        null atanan String variable herhangi bir method call etmez.
        null-> case sensite NULL!=null!=Null
        null ---> dutluk: arsa degeri olmayan arazi :)) sadece hicligi gosteren bir pointer dır.
         */

        String str5; // tanımlanmıs(decleration) ama atanmamıs(non assignment) bos variable

        // System.out.println("str5 = " + str5); // CTE >>> atanmamıs variable meth call edilemez

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("write your name");
        String name = input.nextLine();

        System.out.println("write your surname");
        String surname = input.nextLine();

        System.out.println("name.length() = " + name.length());

         */




    }
}
