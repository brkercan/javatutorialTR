package ch09_Loops.ForLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("bir ifade giriniz");
        String str = input.nextLine();

        String tersStr = "";

        for (int i = str.length()-1; i >= 0; i--){
            tersStr += str.charAt(i);
        }
        if (tersStr.equals(str)){
            System.out.println("bu ifade polindrome'dur");
        }else System.out.println("buc ifade polindrome değildir");


    }


}
