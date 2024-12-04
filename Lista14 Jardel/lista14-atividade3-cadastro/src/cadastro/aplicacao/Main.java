package cadastro.aplicacao;

import cadastro.controle.Cadastro;
import java.util.Scanner;

/**
 * Classe principal que realiza o cadastro de pessoas físicas e jurídicas.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Pessoa Física");
            System.out.println("2 - Cadastrar Pessoa Jurídica");
            System.out.println("3 - Imprimir Cadastro");
            System.out.println("4 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            if (opcao == 4) {
                break;
            }

            System.out.print("Informe o nome: ");
            String nome = scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Informe o CPF: ");
                String CPF = scanner.nextLine();
                cadastro.cadastrarPessoaFisica(nome, CPF);
            } else if (opcao == 2) {
                System.out.print("Informe o CNPJ: ");
                String CNPJ = scanner.nextLine();
                cadastro.cadastrarPessoaJuridica(nome, CNPJ);
            } else if (opcao == 3) {
                cadastro.imprimirCadastro();
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
