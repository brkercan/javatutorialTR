package ch07StringManipulation;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {

          /*
        substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune  String olarak ulaşılmak istenebilir..
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> exclusive/haric
           */

        String str = "madem gelding dünyaya otur çalış JAVA'ya";

        System.out.println("str.substring(10) = " + str.substring(10));

        //str'nin son 10 karakterini print ediniz

        System.out.println("str.substring(str.length()-10) = " + str.substring(str.length() - 10));

        //str'nin ilk 10 karakterini print ediniz
        System.out.println("str.substring(0,10) = " + str.substring(0, 10));

        //str'nin ilk karakterini print ediniz
        System.out.println("str.substring(0,1) = " + str.substring(0, 1));

        //str'nin son karakterini print ediniz
        System.out.println("str.substring(str.length()-1) = " + str.substring(str.length() - 1));

        // task-> girilen 4 harfli bir kelimenin tersten print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz....");
        String str1 = input.nextLine();

        System.out.println((str1.substring(3, 4) + str1.substring(2, 3) + str1.substring(1, 2) + str1.substring(0, 1)));


    }
}
