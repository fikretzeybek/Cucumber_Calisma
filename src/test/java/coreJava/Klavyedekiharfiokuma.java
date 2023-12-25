package coreJava;

import java.util.Scanner;

public class Klavyedekiharfiokuma {


    public static void main(String[] args) {

        Klavyedekiharfiokuma q = new Klavyedekiharfiokuma();

        q.HarfleriYazdir();
    }

    public void HarfleriYazdir() {

        Scanner k = new Scanner(System.in);

        System.out.println("Kelime Giriniz:");

        String kelime = k.nextLine();

        for (int i = 0; i < kelime.length(); i++) {

            char c = kelime.charAt(i);

            System.out.println(c);

        }
    }
}