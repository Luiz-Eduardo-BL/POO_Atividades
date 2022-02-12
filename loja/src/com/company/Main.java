package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Produto p = new Produto();

        int opcoes = 6;

        do{
            Scanner input = new Scanner(System.in);
            System.out.println("\nOla, bem vinda a Corte");
            System.out.println("O que desja saber?");
            System.out.println("__________________________________");
            System.out.println("1 - Produto disponivel");
            System.out.println("2 - Codigo do produto");
            System.out.println("3 - Preco");
            System.out.println("4 - Quantidade em Loja");
            System.out.println("5 - Estoque minimo");
            System.out.println("6 - Descricao");

            opcoes = input.nextInt();

            switch (opcoes){
                case 1:
                    String apresenyacao = p.nome;
                    System.out.printf(apresenyacao);
                    break;
                case 2:
                    int codigo = p.codigo;
                    System.out.printf("O Codigo é: %d",codigo);
                    break;
                case 3:
                    Double preco = p.preco;
                    System.out.printf("O preço é: %d",preco);
                    break;
                case 4:
                    int quantidade = p.quantidade;
                    System.out.printf("Temos na loja %d pecas", quantidade);
                    break;
                case 5:
                    int estoque = p.estoqueMin;
                    System.out.printf("Nosso estoque minimo na loja é %d pecas", estoque);
                    break;
                case 6:
                    String descricao = p.descricao;
                    System.out.printf(descricao);
                    break;
            }

        }while (opcoes > 0);

        System.out.println(p.nome);
    }
}
