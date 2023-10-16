package ch07StringManipulation.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your password...");
        String password = input.nextLine();

        String ilk = String.valueOf(password.charAt(0));
        int son = Integer.parseInt(String.valueOf(password.charAt(password.length() - 1)));

        if (ilk == ilk.toUpperCase()){
            if (son == (password.charAt(password.length() - 1))){
                if(password.length() >= 6){
                    System.out.println("geçerli password");
                }else System.out.println("geçersiz password");
            }else System.out.println("geçersiz password");
        }else System.out.println("geçersiz password");

    }
}
