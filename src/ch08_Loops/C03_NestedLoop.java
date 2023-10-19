package ch08_Loops;

public class C03_NestedLoop {
    public static void main(String[] args) {

        for (int kat = 1; kat <= 9; kat++) {
            System.out.println("kat " + kat);
            for (int daire = 1; daire <= 5; daire++) {
                System.out.println("daire " + daire);
            }
        }
    }
}
