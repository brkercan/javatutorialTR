import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("yasınızı giriniz");
        int yas = input.nextInt();

        if (yas>=18){
            System.out.println("you can enter");
        }else System.out.println("you cannot enter");



    }

}