package org.example.FundamentosN1;
import java.util.Scanner;

// Conversor de temperatura: Receba uma temperatura em Celsius e converta para Fahrenheit.
// Fórmula: °F = (°C * 1.8) + 32
public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // "float" ocupa 32 bits (4 bytes) na memória.
        float temperatura;

        System.out.println("Digite uma temperatura em ºC: ");
        temperatura = Float.parseFloat(scanner.next());

        // "double" ocupa 64 bits (8 bytes) na memória.
        // Ele oferece maior precisão e ocupa mais espaço em memória do que float
        double fahrenheit = (temperatura * 1.8) + 32;

        System.out.println("A temperatura " + temperatura + " ºC em Fahrenheit é: " + fahrenheit + "ºF");
    }
}
