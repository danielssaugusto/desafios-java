package org.example.FundamentosN2;

import java.util.Scanner;

// Número Primo: Verifique se um número digitado é primo ou não.
public class NumeroPrimo {
    // Essa função recebe como parâmetro um número inteiro.
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        // Itera de 2 até a raiz quadrada do número de entrada.
        for (int i = 2; i * i <= numero; i++) {
            // Se o número atual do loop for divisível, significa que o ele não é primo.
            if (numero % i == 0) {
                return false;
            }
        }
        // Se o loop terminar sem encontrar nenhum divisor,
        // Significa que o número é primo, então retorna "true".
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        int num = scanner.nextInt();

        if (isPrimo(num)) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }
        scanner.close();
    }
}