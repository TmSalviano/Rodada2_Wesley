package inteiro.aplicacao;

import inteiro.modelo.Inteiro;
import java.util.Scanner;

/**
 * Classe principal para testar as operações da classe Inteiro.
 * O menu oferece as opções de multiplicação, potência, divisão, verificação de paridade e sair.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inteiro inteiro = new Inteiro();

        while (true) {
            // Exibe o menu de opções
            System.out.println("Escolha uma operação:");
            System.out.println("1 – Multiplicação");
            System.out.println("2 – Potência");
            System.out.println("3 – Divisão");
            System.out.println("4 – Par");
            System.out.println("5 – Sair");
            int opcao = scanner.nextInt();

            if (opcao == 5) {
                System.out.println("Saindo...");
                break;
            }

            System.out.print("Informe o primeiro valor: ");
            int a = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Informe o segundo valor: ");
                int b = scanner.nextInt();
                System.out.println("Resultado da multiplicação: " + inteiro.multiplicacao(a, b));
            } else if (opcao == 2) {
                System.out.print("Informe o expoente: ");
                int b = scanner.nextInt();
                System.out.println("Resultado da potência: " + inteiro.potencia(a, b));
            } else if (opcao == 3) {
                System.out.print("Informe o divisor: ");
                int b = scanner.nextInt();
                try {
                    System.out.println("Resultado da divisão: " + inteiro.divisao(a, b));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            } else if (opcao == 4) {
                System.out.println("O número " + a + " é " + (inteiro.par(a) ? "par" : "ímpar"));
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
