package banco.aplicacao;

import banco.servico.Banco;
import java.util.Scanner;

/**
 * Classe principal para testar a funcionalidade da ContaCorrente.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do objeto Banco que gerencia uma ContaCorrente
        Banco banco = new Banco();

        // Solicita ao usuário os dados da conta
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        System.out.print("Digite o número da agência: ");
        int agencia = scanner.nextInt();

        // Inicializa a conta com os dados fornecidos
        banco.getConta().iniciarContaCorrente(numero, agencia);

        // Solicita o valor para depósito
        System.out.print("Digite o valor para depósito: ");
        double deposito = scanner.nextDouble();
        banco.getConta().depositar(deposito); // Realiza o depósito

        // Exibe os dados da conta após o depósito
        banco.getConta().exibe();

        // Solicita o valor para saque
        System.out.print("Digite o valor para saque: ");
        double saque = scanner.nextDouble();

        // Tenta realizar o saque
        if (banco.getConta().sacar(saque)) {
            System.out.println("Saque realizado com sucesso!");
        }

        // Exibe os dados da conta após o saque
        banco.getConta().exibe();

        scanner.close(); // Fecha o Scanner para liberar o recurso
    }
}
