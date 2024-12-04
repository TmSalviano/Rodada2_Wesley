package cadastro.modelo;

/**
 * Classe que representa uma pessoa jurídica, estendendo a classe Pessoa.
 */
public class PessoaJuridica extends Pessoa {

    private String cnpj; // CNPJ da pessoa jurídica

    /**
     * Obtém o CNPJ da pessoa jurídica.
     *
     * @return CNPJ da pessoa jurídica.
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o CNPJ da pessoa jurídica.
     *
     * @param cnpj CNPJ a ser atribuído à pessoa jurídica.
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
