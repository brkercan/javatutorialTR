package ch07StringManipulation;

import java.util.Scanner;

public class C13_Practice {
    public static void main(String[] args) {

        /*
Integer.valueOf() ile Integer.parseInt() metotları arasında temel fark
valueOf() metodu Integer tipinde bir obj, parseInt() metodu ise int tipinde bir veri tipi döndürür.
parseInt() metodu primitive veri tipi döndürdüğü için daha hızlı çalışır.
 */

        /*
Task->  girilen bir password için aşagıdaki şartları sağlarsa "gayet başarılı DEWAMKEEE :)"
sağlamazsa "Çok başarısız :( agam yeni paaword giresen" print eden code create ediniz.
1-en az 8 karakter uzunlugunda,
2-ilk harf buyuk,
3-son harf kucuk,
4-boşluk içermemeli
 */

        Scanner input = new Scanner(System.in);
        System.out.println("şifrenizi giriniz...");
        String password = input.nextLine();

        if (password.length()>=8 &&
        Character.isUpperCase(password.charAt(0)) &&
        Character.isLowerCase(password.charAt(password.length()-1)) &&
        !password.contains(" ")){
            System.out.println("gayet basarılı DEVAMKEE");
        }else System.out.println("Çok başarısız :( agam yeni paaword giresen");





    }
}
