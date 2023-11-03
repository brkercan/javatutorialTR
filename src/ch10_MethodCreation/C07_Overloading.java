package ch10_MethodCreation;

public class C07_Overloading {
    public static void skorhesapla(String isim, int puan){
        System.out.println(isim +" adlı oyuncunun "+ puan+ " puanı var");
    }
    public static void skorhesapla(int puan){
        System.out.println("isimsiz oyuncunun "+ puan+ " puanı var");
    }
    public static void skorhesapla(String isim){
        System.out.println(isim+" adlı oyuncunun puanı bulunamadı");
    }
    public static void main(String[] args) {
        skorhesapla("burak",76);
        skorhesapla("burak");
        skorhesapla(87);


    }
}
