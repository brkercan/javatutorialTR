package ch07StringManipulation.Tasks;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char birinci = harfDepo.charAt(7);
        char ikinci = harfDepo.charAt(0);
        char ucuncu = harfDepo.charAt(11);
        char dorduncu = harfDepo.charAt(23);
        char besinci = harfDepo.charAt(12);

        System.out.println("(birinci+ikinci+ucuncu+dorduncu+besinci) = " +
                ("" + birinci + ikinci + ucuncu + dorduncu + besinci));

        char birincı = harfDepo.charAt(harfDepo.indexOf('H'));
        char ikincı = harfDepo.charAt(harfDepo.indexOf('A'));
        char ucuncü = harfDepo.charAt(harfDepo.indexOf('L'));
        char dorduncü = harfDepo.charAt(harfDepo.indexOf('U'));
        char besincı = harfDepo.charAt(harfDepo.indexOf('K'));

        System.out.println("(birinci+ikinci+ucuncu+dorduncu+besinci) = " +
                ("" + birincı + ikincı + ucuncü + dorduncü + besincı));


    }
}
