package sistema.aplicacao;

import sistema.controle.Cadastro;
import sistema.modelo.Funcionario;
import java.util.Scanner;

/**
 * Classe principal para iniciar o sistema de cadastro de funcionários.
 */
public class Main {

    public static void main(String[] args) {
        // Scanner para entrada de dados do usuário
        Scanner input = new Scanner(System.in);

        // Instanciação do objeto Cadastro
        Cadastro cadastro = new Cadastro();

        System.out.println("Bem-vindo ao sistema de cadastro de funcionários!");

        // Loop para cadastro de funcionários
        while (true) {
            System.out.println("\nDeseja cadastrar um novo funcionário? (sim/nao)");
            String resposta = input.next();

            if (resposta.equalsIgnoreCase("nao")) {
                break;
            }

            // Captura os dados do funcionário
            System.out.print("Nome: ");
            input.nextLine(); // Consumir quebra de linha pendente
            String nome = input.nextLine();

            System.out.print("Idade: ");
            int idade = input.nextInt();

            System.out.print("Cargo: ");
            input.nextLine(); // Consumir quebra de linha pendente
            String cargo = input.nextLine();

            System.out.print("Salário: ");
            double salario = input.nextDouble();

            System.out.print("Telefone: ");
            input.nextLine(); // Consumir quebra de linha pendente
            String telefone = input.nextLine();

            System.out.print("Endereço: ");
            String endereco = input.nextLine();

            // Cria o objeto Funcionario e cadastra no sistema
            Funcionario func = new Funcionario(nome, idade, cargo, salario, telefone, endereco);
            cadastro.cadastrarFuncionario(func);

            System.out.println("Funcionário cadastrado com sucesso!");
        }

        // Exibe todos os funcionários cadastrados
        cadastro.exibeFuncionarios();

        // Fecha o scanner
        input.close();
    }
}
