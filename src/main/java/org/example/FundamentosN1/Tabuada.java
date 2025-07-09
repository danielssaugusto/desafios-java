package org.example.FundamentosN1;

import java.util.Scanner;

// Tabuada: Peça um número e imprima sua tabuada de 1 a 10.
public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int multiplicacao = scanner.nextInt();

        System.out.println("\n***************");
        System.out.println("    TABUADA");
        System.out.println("***************\n");

        for (int i = 0; i <= 10; i++) {
            int resultado = multiplicacao * i;
            System.out.println(multiplicacao + " X " + i + " = " + resultado);
        }
    }
}
