package cadastro.modelo;

/**
 * Classe que representa uma pessoa jurídica, que é uma pessoa com CNPJ.
 * Extende a classe Pessoa.
 */
public class PessoaJuridica extends Pessoa {

    private String CNPJ;

    /**
     * Construtor para criar uma pessoa jurídica com nome e CNPJ.
     *
     * @param nome Nome da pessoa.
     * @param CNPJ CNPJ da pessoa jurídica.
     */
    public PessoaJuridica(String nome, String CNPJ) {
        super(nome); // Chama o construtor da classe Pessoa
        this.CNPJ = CNPJ;
    }

    /**
     * Método para obter o CNPJ da pessoa jurídica.
     *
     * @return O CNPJ da pessoa jurídica.
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * Método para definir o CNPJ da pessoa jurídica.
     *
     * @param CNPJ O CNPJ da pessoa jurídica.
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
