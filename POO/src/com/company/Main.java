package com.company;
import java.util.Scanner;
import java.util.SortedSet;

public class Main {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        int opcao = 4;
        int num1;
        int num2;

        do {

            Scanner input = new Scanner(System.in);
            System.out.println("\nEsolha uma opcao!");
            System.out.println("Caso coloque algo diferente das opcoes o programa sera encerrado!\n");
            System.out.println("1- Soma");
            System.out.println("2- Subtracao");
            System.out.println("3- Divisao");
            System.out.println("4- Multiplicacao");
            System.out.println("0- Sair\n");
            System.out.println("Operacao: ");

            opcao = input.nextInt();

            Scanner input1 = new Scanner(System.in);

            System.out.println("Primeiro Numero: ");
            num1 = input1.nextInt();
            System.out.println("Segundo Numero: ");
            num2 = input1.nextInt();

            switch (opcao) {
                case 1:
                    int operacao = c.soma(num1, num2);
                    System.out.printf("\nO resultado da Soma eh: %d\n", operacao);
                    break;
                case 2:
                    operacao = c.sub(num1, num2);
                    System.out.printf("\nO resultado da Subtracao eh: %d\n", operacao);
                    break;
                case 3:
                    operacao = c.div(num1, num2);
                    System.out.printf("\nO resultado da Divisao eh: %d\n", operacao);
                    break;
                case 4:
                    operacao = c.mult(num1, num2);
                    System.out.printf("\nO resultado da Multiplicacao eh: %d\n", operacao);
                    break;
            }
        }while (opcao != 0);
    }
}
