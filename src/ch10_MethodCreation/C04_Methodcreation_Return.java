package ch10_MethodCreation;

public class C04_Methodcreation_Return {
    public static int toplama(int a, int b, int c){
        //System.out.println(a+b+c);
        return (a+b+c);

    }
    public static void main(String[] args) {
        toplama(1, 2, 3);
        System.out.println("çıktı değeri "+toplama(1, 2, 3));


    }
}
