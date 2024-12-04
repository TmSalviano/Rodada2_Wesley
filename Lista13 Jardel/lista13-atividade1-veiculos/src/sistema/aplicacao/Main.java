package sistema.aplicacao;

import sistema.controle.Cadastro;
import sistema.modelo.Veiculo;
import java.util.Scanner;

/**
 * Classe principal para iniciar o sistema de cadastro de veículos.
 */
public class Main {

    public static void main(String[] args) {
        // Scanner para entrada de dados do usuário
        Scanner input = new Scanner(System.in);

        // Instanciação do objeto Cadastro
        Cadastro cadastro = new Cadastro();

        System.out.println("Bem-vindo ao sistema de cadastro de veículos!");

        // Loop para cadastro de veículos
        while (true) {
            System.out.println("\nDeseja cadastrar um novo veículo? (sim/nao)");
            String resposta = input.next();

            if (resposta.equalsIgnoreCase("nao")) {
                break;
            }

            // Captura os dados do veículo
            System.out.print("Marca: ");
            input.nextLine(); // Consumir quebra de linha pendente
            String marca = input.nextLine();

            System.out.print("Modelo: ");
            String modelo = input.nextLine();

            System.out.print("Número do Chassi: ");
            String numeroChassi = input.nextLine();

            System.out.print("Placa: ");
            String placa = input.nextLine();

            System.out.print("Cor: ");
            String cor = input.nextLine();

            // Cria o objeto Veiculo e cadastra no sistema
            Veiculo veiculo = new Veiculo(marca, modelo, numeroChassi, placa, cor);
            cadastro.cadastrarVeiculo(veiculo);

            System.out.println("Veículo cadastrado com sucesso!");
        }

        // Exibe todos os veículos cadastrados
        cadastro.exibeVeiculos();

        // Fecha o scanner
        input.close();
    }
}
