package ch10_MethodCreation;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("çevrilecek birim giriniz");
        String birim = input.nextLine().toLowerCase();
        System.out.println("çevrilecek birimin miktarını giriniz");
        double miktar = input.nextDouble();

        donustur(birim, miktar);



    }

    private static void donustur(String birim, double miktar) {

        switch (birim) {
            case "saat":
                System.out.println("girdiğin "+miktar+" saatin saniye degeri : "+(miktar*3600));
                break;

            case "mil":
                System.out.println("girdiğin "+miktar+" milin km degeri : "+(miktar*1.6));
                break;

            case "kg":
                System.out.println("girdiğin "+miktar+" kg'ın gram degeri : "+(miktar*1000));
                break;

            default:
                System.out.println("hatalı giris yaptınız");
        }

    }
}
