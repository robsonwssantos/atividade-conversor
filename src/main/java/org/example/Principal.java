package org.example;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // criar uma instância da classe Conversor
        Conversor conversor = new Conversor();

        Scanner scanner = new Scanner(System.in);
        boolean rodando = true; // condição para manter a aplicação rodando enquanto temos a interação do usuário

        while(rodando) {
            System.out.println("-----------------------------------------------------");
            System.out.println(" BEM VINDO AO CONVERSOR DE NÚMEROS ROMANOS E REAIS   ");
            System.out.println("-----------------------------------------------------");
            System.out.println(" ");
            System.out.println("Escolha uma opção:");
            System.out.println("Digite [1] para converter número REAL em número ROMANO: ");
            System.out.println("Digite [2] Converter número ROMANO em número REAL: ");
            System.out.println("Digite [3] para limpar console");
            System.out.println("Digite [4] para SAIR:");
            System.out.println(" ");

            int opcao = scanner.nextInt();
            scanner.nextLine();// recebe a opção do teclado

            switch (opcao) {
                case 1:
                    System.out.println("Digite um numero real");
                    int numeroReal = scanner.nextInt();
                    String resultadoNumeroRomano = conversor.converterNumeroReal(numeroReal);
                    System.out.println("A conversão do número real " + numeroReal  + " para romano é: " + resultadoNumeroRomano);
                    System.out.println("------------");
                    break;
                case 2:
                    System.out.println("Digite um número romano: ");
                    String numeroRomano = scanner.nextLine().toUpperCase();
                    int resultadoNumeroReal = conversor.converterNumeroRomano(numeroRomano);
                    System.out.println("A conversão do número romano " + numeroRomano +  " para número real é: " + resultadoNumeroReal);
                    System.out.println("------------");
                    break;
                case 3:
                    //Limpar console
                    for(int i = 0; i < 50; i++){
                        System.out.println();
                    }
                    break;
                case 4:
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor digite uma opção válida.");
            }

        }
     System.out.println("Muito obrigado por usar nosso sistema :).");
     System.out.println("Encerrando.");
     scanner.close(); //fechando conexão com a classe Scanner
    }
}

