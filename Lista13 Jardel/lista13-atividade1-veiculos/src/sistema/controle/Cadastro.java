package sistema.controle;

import sistema.modelo.Veiculo;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar o cadastro de veículos.
 */
public class Cadastro {

    // Lista para armazenar os veículos cadastrados
    private List<Veiculo> veiculos;

    /**
     * Construtor que inicializa a lista de veículos.
     */
    public Cadastro() {
        veiculos = new ArrayList<>();
    }

    /**
     * Cadastra um novo veículo na lista.
     *
     * @param veiculo Objeto da classe Veiculo a ser cadastrado
     */
    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    /**
     * Exibe todos os veículos cadastrados.
     */
    public void exibeVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            System.out.println("\n--- Lista de Veículos Cadastrados ---");
            for (Veiculo veiculo : veiculos) {
                veiculo.exibe();
                System.out.println("------------------------------------");
            }
        }
    }
}
