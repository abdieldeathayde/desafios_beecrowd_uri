package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);


        int idadeEmDias = sc.nextInt();

        int idadeEmAnos = idadeEmDias / 365;
        idadeEmDias %=  365;
        int idadeEmMeses = idadeEmDias / 30;
        idadeEmDias %= 30;

        System.out.println(idadeEmAnos + " ano(s)");
        System.out.println(idadeEmMeses + " mes(es)");
        System.out.println(idadeEmDias + " dia(s)");

    }

}
