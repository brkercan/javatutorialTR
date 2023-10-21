package ch08_Loops.ForLoop.Tasks;

import java.util.Scanner;

public class Task29 {

    public static void main(String[] args) {
        // task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
        // ornek : Haluk  output: HaLuK

        Scanner input = new Scanner(System.in);
        System.out.println("bir ifade giriniz");
        String str = input.nextLine();
        String tersStr = "";

        for(int i=0; i<str.length(); i++) {
            System.out.print((i % 2 == 0) ?
                    str.substring(i, i + 1).toUpperCase() :
                    str.substring(i, i + 1).toLowerCase());
        }



    }
}
