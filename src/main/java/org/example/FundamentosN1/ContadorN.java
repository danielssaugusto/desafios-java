package org.example.FundamentosN1;

import java.util.Scanner;

// Contador de 1 a N: Peça um número N e imprima de 1 até N.
public class ContadorN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro qualquer: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println("numero: " + i);
        }
    }
}
