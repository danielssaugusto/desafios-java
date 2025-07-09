package org.example.FundamentosN2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Soma de Vetores: Peça 10 números, armazene em um array e imprima a soma total.
public class SomaVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int num = scanner.nextInt();

            // Variável "numeros" adiciona valor "num"
            numeros.add(num);
        }

        // Verifica o tamanho do ArrayList (Quantidade de valores)
        int listaTamanho = numeros.size();

        // inicia a variável "soma" no escopo global
        int soma = 0;

        // Erro de lógica: "i <= listaTamanho"
        for (int i = 0; i < listaTamanho; i++) {
            soma += numeros.get(i);
        }

        System.out.println("O soma dos valores da lista é: " + soma);
    }
}
