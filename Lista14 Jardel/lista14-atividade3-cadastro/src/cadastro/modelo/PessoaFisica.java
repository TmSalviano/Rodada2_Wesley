package cadastro.modelo;

/**
 * Classe que representa uma pessoa física, que é uma pessoa com CPF.
 * Extende a classe Pessoa.
 */
public class PessoaFisica extends Pessoa {

    private String CPF;

    /**
     * Construtor para criar uma pessoa física com nome e CPF.
     *
     * @param nome Nome da pessoa.
     * @param CPF CPF da pessoa física.
     */
    public PessoaFisica(String nome, String CPF) {
        super(nome); // Chama o construtor da classe Pessoa
        this.CPF = CPF;
    }

    /**
     * Método para obter o CPF da pessoa física.
     *
     * @return O CPF da pessoa física.
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * Método para definir o CPF da pessoa física.
     *
     * @param CPF O CPF da pessoa física.
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
