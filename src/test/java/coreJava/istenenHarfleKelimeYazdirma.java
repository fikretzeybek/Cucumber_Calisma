package coreJava;

import java.util.Scanner;

public class istenenHarfleKelimeYazdirma {


    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("Cümleyi giriniz:");

        String cumle = k.nextLine();


        Scanner Cumleokuyucu = new Scanner(cumle);

        while (Cumleokuyucu.hasNext()) {

            String kelime = Cumleokuyucu.next();

            if (kelime.startsWith("b") || kelime.startsWith("B")) {

                System.out.println("Kelime:" + kelime);

            }

        }
    }

}
