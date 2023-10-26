package ch09_Loops.ForLoop.Tasks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :3
         */

        Scanner input = new Scanner(System.in);
        System.out.println("bir ifade giriniz");
        String str = input.nextLine();
        System.out.println("harf giriniz");
        char harf = input.next().charAt(0);
        int harfAdet = 0;

        for (int i = 0; i <str.length(); i++){
            if(str.charAt(i) == harf){
                harfAdet++;
            }
        }
        System.out.println(harfAdet + " adet " + harf + " vardır");


    }
}
