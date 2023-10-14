package ch07StringManipulation;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {

           /*
            charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
            Çoooğğğ önemli ->  index değeri her zaman 0'dan başlar.-> ucağın koltuk nosu 0'dan başlar
            */

        String qa = "Muhammed Team Lead";
        System.out.println("qa = " + qa);

        System.out.println("qa.charAt(5) = " + qa.charAt(5));
        char yedinciCharacter = qa.charAt(7);
        System.out.println("yedinciCharacter = " + yedinciCharacter);

        System.out.println("qa.charAt(qa.length()-1) = " + qa.charAt(qa.length() - 1));

        // Trick --> son index = str.length() - 1

        //task-> Girilen bir String ifadenin ortadaki karakterini print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("bir ifade giriniz...");

        String str1 = input.nextLine();

        if (str1.length()/2!=0){
            System.out.println(str1.charAt(str1.length()/2));
        }else System.out.println("orta karakteri yoktur..");


    }
}
