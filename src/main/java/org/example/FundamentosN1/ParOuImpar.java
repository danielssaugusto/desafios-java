package org.example.FundamentosN1;

import java.util.Scanner;

// Par ou Ímpar: Peça um número e diga se ele é par ou ímpar.
public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        // Note: "System.out.println" funciona apenas dentro do método "main".
        System.out.println("Digite um número: ");
        numero = Integer.parseInt(scanner.next());

        if (numero % 2 == 0) {
            System.out.println("O número digitado é PAR!");
            // Usando o método "Character" para verificar se o caractere fornecido for um dígito decimal.
        } else if (!Character.isDigit(numero)) { // Se o número for diferente de um caractere.
            System.out.println("O número digitado é ÍMPAR!");
        } else {
            System.out.println("Digite um número válido!");
        }
    }
}
