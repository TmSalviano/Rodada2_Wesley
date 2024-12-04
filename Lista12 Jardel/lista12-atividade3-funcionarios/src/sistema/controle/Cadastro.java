package sistema.controle;

import sistema.modelo.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar o cadastro de funcionários.
 */
public class Cadastro {

    // Lista para armazenar os funcionários cadastrados
    private List<Funcionario> funcionarios;

    /**
     * Construtor que inicializa a lista de funcionários.
     */
    public Cadastro() {
        funcionarios = new ArrayList<>();
    }

    /**
     * Cadastra um novo funcionário na lista.
     *
     * @param funcionario Objeto da classe Funcionario a ser cadastrado
     */
    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    /**
     * Exibe todos os funcionários cadastrados.
     */
    public void exibeFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("\n--- Lista de Funcionários Cadastrados ---");
            for (Funcionario func : funcionarios) {
                func.exibe();
                System.out.println("------------------------------------");
            }
        }
    }
}
