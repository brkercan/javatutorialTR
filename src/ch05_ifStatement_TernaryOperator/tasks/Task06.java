package ch05_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
		Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */
        Scanner input = new Scanner(System.in);
        System.out.println("cinsiyetinizi giriniz");
        String gender = input.nextLine();

        if (gender.equals("erkek")){
            System.out.println("yasınızı giriniz");
            int yas = input.nextInt();
            if (yas>18){
                System.out.println("Adam");
            }else System.out.println("erkek cocuk");
        }else if (gender.equals("kadın")){
            System.out.println("yasınızı giriniz");
            int yas2 = input.nextInt();
            if (yas2>18){
                System.out.println("Kadın");
            }else System.out.println("kız cocuk");
        }else System.out.println("yanlıs giris yaptınız");


    }
}































