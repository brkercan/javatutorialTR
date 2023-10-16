package ch07StringManipulation;

import java.util.Scanner;

public class C10_indexOf_lastindexOf {
    public static void main(String[] args) {

/* indexOf()
   char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
   Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
   contains den farkı indexini verir, contains ise true false
 */


        String str = "madem geldin dünyaya otur çalış JAVA'ya :)";

        System.out.println("str.indexOf(\':\') = " + str.indexOf(':'));
        System.out.println(str.indexOf("a"));
        System.out.println("str.indexOf(\"JAVA\") = " + str.indexOf("JAVA"));
        System.out.println("str.indexOf(\"Java\") = " + str.indexOf("Java"));

        System.out.println("str.indexOf(\"a\",12) = " + str.indexOf("a", 12));

        System.out.println("str.indexOf(\"a\",str.indexOf(\"a\")) = " + str.indexOf("a", (str.indexOf("a"))));

        /* lastIndexOf()
 String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
 indexOf un sondan olan hali fakat index numaraları değişmez.
 lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
 indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
 */

        System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a"));

        System.out.println("str.lastIndexOf(\"x\") = " + str.lastIndexOf("x")); // olmayan karakter-->>>>  -1

        System.out.println(str.lastIndexOf(')')); // 41

        /* Task-> girilen bir string ifadenin aşağıdaki şartları sağlamasını kontrol eden code create ediniz
a-) girilen ifade java içermiyor
b-) girilen ifade 1 adet java içeriyor
c-) girilen ifade  1'den çok java içeriyor
 */

        Scanner input = new Scanner(System.in);
        System.out.println("bir ifade giriniz...");
        String str3 = input.nextLine();

        if (str3.indexOf("java") == -1) {
            System.out.println("girilen ifadede hic java bulunmaz");
        }else if (str3.indexOf("java") == str3.lastIndexOf("java")) {
            System.out.println("girilen ifadede 1 tane java bulunur");
        }else System.out.println("girilen ifadede en az 2 tane java bulunur");




    }
}
