package veiculos.aplicacao;

import veiculos.dao.VeiculoDAO;
import veiculos.modelo.Veiculo;

import java.util.Scanner;

/**
 * Classe principal do programa.
 */
public class Main {
    public static void main(String[] args) {
        VeiculoDAO dao = new VeiculoDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                        1. Cadastrar veículo
                        2. Listar veículos
                        3. Atualizar veículo
                        4. Excluir veículo
                        5. Sair
                    """);
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            if (opcao == 1) {
                Veiculo veiculo = new Veiculo();
                System.out.print("Marca: ");
                veiculo.setMarca(scanner.nextLine());
                System.out.print("Modelo: ");
                veiculo.setModelo(scanner.nextLine());
                System.out.print("Número do Chassi: ");
                veiculo.setNumeroChassi(scanner.nextLine());
                System.out.print("Placa: ");
                veiculo.setPlaca(scanner.nextLine());
                System.out.print("Cor: ");
                veiculo.setCor(scanner.nextLine());
                dao.inserir(veiculo);
            } else if (opcao == 2) {
                dao.listar().forEach(v -> {
                    System.out.println("Marca: " + v.getMarca());
                    System.out.println("Modelo: " + v.getModelo());
                    System.out.println("Número do Chassi: " + v.getNumeroChassi());
                    System.out.println("Placa: " + v.getPlaca());
                    System.out.println("Cor: " + v.getCor());
                    System.out.println("-------------------------");
                });
            } else if (opcao == 3) {
                System.out.print("Placa do veículo a ser atualizado: ");
                String placa = scanner.nextLine();
                Veiculo veiculo = new Veiculo();
                System.out.print("Nova marca: ");
                veiculo.setMarca(scanner.nextLine());
                System.out.print("Novo modelo: ");
                veiculo.setModelo(scanner.nextLine());
                System.out.print("Novo número do chassi: ");
                veiculo.setNumeroChassi(scanner.nextLine());
                System.out.print("Nova cor: ");
                veiculo.setCor(scanner.nextLine());
                dao.atualizar(placa, veiculo);
            } else if (opcao == 4) {
                System.out.print("Placa do veículo a ser removido: ");
                String placa = scanner.nextLine();
                dao.excluir(placa);
            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}