package my_Study;

import java.sql.SQLOutput;
import java.util.Scanner;

public class you_tube {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.println("adınızı ve soy adınızı giriniz");
        String nameSurname = input.nextLine();

        System.out.println("okul numaranızı giriniz");
        int schoolNum = input.nextInt();

        if (schoolNum>1000){
            System.out.println("okul numaranızı yanlış girdiniz...");
            Scanner input1 = new Scanner(System.in);
            System.out.println("tekrar okul numaranızı giriniz...");
            int number = input1.nextInt();
            if(number>1000){
                System.out.println("okul numaranızı tekrar yanlış girdiniz...." +
                        "sistem yöneticinize başvurunuz" +
                        "çıkış yapıldı...");
            }else System.out.println("devam edebilirsinşiz...");

        }else System.out.println("devam edebilirsiniz...");


        System.out.println("enter your vise score");
        int viseScore = input.nextInt();

        System.out.println("enter your final score");
        int finalScore = input.nextInt();

        double notOrt = viseScore*0.4 + finalScore*0.6;

        if(notOrt>90.0){
            System.out.println("your score is AA");
        }else if (notOrt<90.0 && notOrt>80.0){
            System.out.println("your score is BB");
        }else if (notOrt<80.0 && notOrt>70){
            System.out.println("your score is CC");
        }else if (notOrt<70.0 && notOrt>60){
            System.out.println("your score is DD");
        }else System.out.println("your score is FF");








    }
}
