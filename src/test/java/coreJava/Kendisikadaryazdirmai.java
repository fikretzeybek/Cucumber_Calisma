package coreJava;

import java.util.Scanner;

public class Kendisikadaryazdirmai {


    public static void main(String[] args) {

        System.out.println("Sayı giriniz : ");

        Scanner inp = new Scanner(System.in);

        int sira = inp.nextInt();

        for (int i = sira; i >= 1; i--)

        {

            for (int j = i; j >= 1; j--)

            {

                System.out.print(j +" ");

            }

            for (int k = 2; k <= i; k++) {

                System.out.print(k +" ");

            }

            System.out.println(" ");

        }


    }

}