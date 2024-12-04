package cadastro.modelo;

/**
 * Classe que representa uma pessoa física, estendendo a classe Pessoa.
 */
public class PessoaFisica extends Pessoa {

    private String cpf; // CPF da pessoa física

    /**
     * Obtém o CPF da pessoa física.
     *
     * @return CPF da pessoa física.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF da pessoa física.
     *
     * @param cpf CPF a ser atribuído à pessoa física.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
