package ch07StringManipulation.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String str = input.nextLine();

        System.out.println("str.contains(\" \") = " + str.contains(" "));
    }
}

