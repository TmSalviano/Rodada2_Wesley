package cadastro.modelo;

/**
 * Classe que representa uma pessoa genérica com um atributo de nome.
 */
public class Pessoa {

    private String nome; // Nome da pessoa

    /**
     * Obtém o nome da pessoa.
     *
     * @return Nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     *
     * @param nome Nome a ser atribuído à pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
