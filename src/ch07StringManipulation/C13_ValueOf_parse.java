package ch07StringManipulation;

public class C13_ValueOf_parse {
    public static void main(String[] args) {

        /*
 Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
 Stringlerle matematiksel islemler yapabilmemizi saglar.

valueOf(); meth hem Integer wrapper  hem de String Class'da bulunur. Integer wrapper Class
 valueOf() methdou String'i integer'a  String Class valueOf() methodu integer'i String'e cevirir.
 */

// task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..

        String b1 = "10000";
        String b2 = "12000";

        int yeniB1 = Integer.valueOf(b1); // String olan b1 integer'a çevirerek int data type atandı
        int yeniB2 = Integer.valueOf(b2); // String olan b2 integer'a çevirerek int data type atandı

        int bagısToplamı = yeniB1+yeniB2;
        System.out.println("bagısToplamı = " + bagısToplamı);
    }
}
