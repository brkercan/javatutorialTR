package ch07StringManipulation;

public class C01_Concatenation {
    public static void main(String[] args) {


        String qa = "sebnem";
        String teamLead = "feride";

        System.out.println("teamLead.concat(qa) = " + teamLead.concat(qa));
        System.out.println("qa.concat(teamLead) = " + qa.concat(teamLead));

        // String methodları variable da kalıcı degil gecici degisiklik yapar
        // String variable a kalıcı degisiklik yapmak icin atama (=) yapmalı

        System.out.println("qa = " + qa);
        System.out.println("qa.toUpperCase() = " + qa.toUpperCase());
        System.out.println("qa = " + qa);

        qa = teamLead.concat(qa);  // atama yaptık
        System.out.println("qa = " + qa); // kalıcı degisiklik oldu

        /*
        Trick --> concat meth. parametre olarak string harici
        tum dataları Stringe cevirip concat eder
         */

        System.out.println("teamLead.concat(23+\"$\") = " + teamLead.concat(23 + "$"));
        System.out.println("teamLead.concat(100+\"\") = " + teamLead.concat(100 + ""));
        System.out.println("teamLead.concat(true+\"\") = " + teamLead.concat(true + ""));

    }
}
