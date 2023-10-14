package ch07StringManipulation;

import java.util.Scanner;

public class C05_Starts_EndsWith {
    public static void main(String[] args) {

            /*
  startsWith()
  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
  String'in basladigi characteri dogrular
  endsWith()
  Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
    */

        String str1 = "ebikGabık";
        System.out.println("str1 = " + str1);

        System.out.println("str1.startsWith(\"e\") = " + str1.startsWith("e"));

        String str2 = "ebik";

        System.out.println("str1.startsWith(str2) = " + str1.startsWith(str2));
        System.out.println("str2.startsWith(str1) = " + str2.startsWith(str1));
        System.out.println("str2.startsWith(str2) = " + str2.startsWith(str2));

        System.out.println("str1.endsWith(str2) = " + str1.endsWith(str2));
        System.out.println("str2.endsWith(str1) = " + str2.endsWith(str1));
        System.out.println("str1.endsWith(str1) = " + str1.endsWith(str1));

        Scanner input = new Scanner(System.in);
        String mailSonu = "@gmail.com";
        System.out.println("mailinizi giriniz....");
        String mail = input.nextLine();

        if (mail.endsWith(mailSonu)) {
            System.out.println("giris yapabilirsiniz...");
        }else System.out.println("mailinizi yanlıs girdiniz...");

    }

}
