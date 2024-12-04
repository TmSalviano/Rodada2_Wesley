package cadastro.modelo;

/**
 * Classe base que representa uma pessoa com um nome.
 */
public class Pessoa {

    private String nome;

    /**
     * Construtor para criar uma pessoa com nome.
     *
     * @param nome Nome da pessoa.
     */
    public Pessoa(String nome) {
        this.nome = nome;
    }

    /**
     * Método para obter o nome da pessoa.
     *
     * @return O nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome da pessoa.
     *
     * @param nome O nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
