package org.example.FundamentosN1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Calculadora Simples: Crie um programa que receba dois números e uma operação (+, -, *, /) e retorne o resultado.
public class Calculadora {
    public static void main(String[] args) {
        // Iniciando o Scanner.
        Scanner scanner = new Scanner(System.in);

        // Iniciando uma lista para armazenar os números do usuário.
        List<Integer> numeros = new ArrayList<>();
        int resultado;

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.println("Seu número: " + numero);

            // Adicionando o número digitado a cada repetição dentro da lista.
            numeros.add(numero);
        }

        System.out.println("Digite uma operação matemática: [+, -, *, /]");
        String operador = scanner.nextLine();

        System.out.println("Seu Cálculo:");

        // Capturando uma posição dentro da lista usando o método ".get()".
        System.out.println(numeros.get(0) + " " + operador + " " + numeros.get(1));

        // Usando o método ".equals()" para comparação com o input do usuário.
        if (operador.equals("+")) {
            resultado = numeros.get(0) + numeros.get(1);
        } else if (operador.equals("-")) {
            resultado = numeros.get(0) - numeros.get(1);
        } else if (operador.equals("*")) {
            resultado = numeros.get(0) * numeros.get(1);
        } else if (operador.equals("/")) {
            resultado = numeros.get(0) / numeros.get(1);
        }
        else {
            System.out.println("Digite um operador válido!");
            return;
        }

        System.out.println("Resultado: " + resultado);
    }
}