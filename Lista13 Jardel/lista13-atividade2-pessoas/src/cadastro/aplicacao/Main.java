package cadastro.aplicacao;

import cadastro.controle.Cadastro;
import cadastro.modelo.Pessoa;
import cadastro.modelo.PessoaFisica;
import cadastro.modelo.PessoaJuridica;

import java.util.Scanner;

/**
 * Classe principal que inicia o sistema de cadastro de pessoas.
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();

        System.out.println("Bem-vindo ao sistema de cadastro de pessoas!");

        while (true) {
            System.out.println("\nDeseja cadastrar uma pessoa? (sim/nao)");
            String resposta = input.next();

            if (resposta.equalsIgnoreCase("nao")) {
                break;
            }

            System.out.println("Escolha o tipo de pessoa para cadastrar:");
            System.out.println("1 - Pessoa Física");
            System.out.println("2 - Pessoa Jurídica");
            System.out.println("3 - Pessoa Genérica");

            int tipo = input.nextInt();
            input.nextLine(); // Consumir a quebra de linha pendente

            Pessoa pessoa;

            System.out.print("Nome: ");
            String nome = input.nextLine();

            if (tipo == 1) {
                PessoaFisica pessoaFisica = new PessoaFisica();
                pessoaFisica.setNome(nome);
                System.out.print("CPF: ");
                pessoaFisica.setCpf(input.nextLine());
                pessoa = pessoaFisica;
            } else if (tipo == 2) {
                PessoaJuridica pessoaJuridica = new PessoaJuridica();
                pessoaJuridica.setNome(nome);
                System.out.print("CNPJ: ");
                pessoaJuridica.setCnpj(input.nextLine());
                pessoa = pessoaJuridica;
            } else {
                pessoa = new Pessoa();
                pessoa.setNome(nome);
            }

            cadastro.cadastrarPessoa(pessoa);
            System.out.println("Pessoa cadastrada com sucesso!");
        }

        // Exibe todas as pessoas cadastradas
        cadastro.exibePessoas();

        input.close();
    }
}
