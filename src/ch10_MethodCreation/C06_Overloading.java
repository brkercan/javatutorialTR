package ch10_MethodCreation;

public class C06_Overloading {
    public static void toplama(String a, String b) {
        System.out.println(a+" "+b);
    }
    public static void toplama(int a, int b){
        System.out.println("toplamları " +(a+b));
    }
    public static void toplama(int a, int b, int c){
        System.out.println("toplamları = "+(a+b+c));
    }
    public static void main(String[] args) {
        toplama(3,4,5);

        toplama(1,2);

        toplama("burak", "ercan");


    }
}
