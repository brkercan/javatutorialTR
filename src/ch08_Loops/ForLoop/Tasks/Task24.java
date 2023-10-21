package ch08_Loops.ForLoop.Tasks;

import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {
		/*
		 Task -> girilen  String'in tersini(reverse String) print eden code create ediniz
		 */

        Scanner input = new Scanner(System.in);
        System.out.println("bir ifade giriniz");
        String str = input.nextLine();
        String tersStr = "";

        for (int i = 1; i <= str.length(); i++) {
            tersStr+=str.charAt(str.length() - i);
        }
        System.out.println("tersStr = " + tersStr);


    }

}
