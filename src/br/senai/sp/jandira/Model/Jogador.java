package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Jogador extends Pessoas{

    private String posicao;
    private int numeroCamisa;

    Scanner scanner = new Scanner(System.in);

    public void cadastrarJogador(){
        System.out.println("------Cadastrar Jogador------");
        System.out.println("Informe o nome: ");
        super.nome = scanner.nextLine();
        System.out.println("Informe o CPF: ");
        super.cpf = scanner.nextLong();
        System.out.println("Informe o RG: ");
        super.rg = scanner.nextLong();
        System.out.println("Informe a idade: ");
        super.idade = scanner.nextInt();
        System.out.println("Informe a posição: ");
        posicao = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Infome o número da Camisa: ");
        numeroCamisa = scanner.nextInt();
        System.out.println("-------------------------------");
    }
}
