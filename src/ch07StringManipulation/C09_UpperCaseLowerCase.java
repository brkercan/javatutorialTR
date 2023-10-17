package ch07StringManipulation;

public class C09_UpperCaseLowerCase {
    public static void main(String[] args) {

           /*
toUpperCase()-> verilen string'i tum harflerini BUYUK harfe çevirir.
toLowerCase()-> verilen string'i tum harflerini kucuk harfe çevirir.
ignoreCase()-> verilen string'i BUYUK-kucuk harf duyarlılığını kaldırır.
  */


        String str = "madem gelding dünyaya otur çalış JAVA'ya";
        System.out.println("str.toUpperCase() = " + str.toUpperCase());
        System.out.println("str.toLowerCase() = " + str.toLowerCase());

        String a = "BURAK";

        System.out.println("a.substring(0,1)+a.substring(1).toLowerCase() = "
                + a.substring(0, 1) + a.substring(1).toLowerCase());


    }
}
