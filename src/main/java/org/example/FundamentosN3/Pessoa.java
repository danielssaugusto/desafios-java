package org.example.FundamentosN3;

// Classe Pessoa: Crie uma classe Pessoa com nome, idade e um método que diz "Olá, meu nome é X".
public class Pessoa {
    String nome;
    int idade;

    // Construtor: Usado para inicializar os objetos Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método que diz "Olá, meu nome é X"
    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome);
    }

    public static void main(String[] args) {
        // Criando um objeto (instância) da classe Pessoa.
        Pessoa pessoa1 = new Pessoa("Alice", 30);

        // Chamando o método "apresentar" para a pessoa1.
        pessoa1.apresentar();

        Pessoa pessoa2 = new Pessoa("James", 35);
        pessoa2.apresentar();
    }
}
