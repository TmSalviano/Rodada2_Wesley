package produtos;

/**
 * Classe que representa um produto com identificador, nome e preço.
 */
public class Produto {
    private static int ultimoId = 0; // Contador para o último ID gerado
    private final int id;            // Identificador do produto (só leitura)
    private String nome;              // Nome do produto
    private double preco;             // Preço do produto

    /**
     * Construtor sem parâmetros. Inicializa o ID com o próximo valor disponível, preço com 0 e nome como "Nome não informado".
     */
    public Produto() {
        this.id = ++ultimoId;         // Atribui o ID e incrementa o último ID
        this.nome = "Nome não informado";
        this.preco = 0.0;
    }

    /**
     * Construtor com parâmetros. Inicializa o ID com o próximo valor disponível, preço e nome informados.
     *
     * @param nome Nome do produto.
     * @param preco Preço do produto.
     */
    public Produto(String nome, double preco) {
        this();                        // Chama o construtor sem parâmetros para atribuir o ID
        this.nome = nome;
        if (preco < 0) {               // Valida o preço, caso seja negativo, atribui 0
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

    /**
     * Obtém o ID do produto.
     *
     * @return O identificador do produto.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtém o nome do produto.
     *
     * @return O nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do produto.
     *
     * @param nome Nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o preço do produto.
     *
     * @return O preço do produto.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço do produto.
     * Se o preço fornecido for negativo, atribui 0 como valor.
     *
     * @param preco Novo preço do produto.
     */
    public void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }
    }

    /**
     * Exibe as informações do produto.
     *
     * @return Uma string com as informações do produto.
     */
    public String exibe() {
        return String.format("Produto: %s\nId: %d\nNome: %s\nPreço: %.2f", nome, id, nome, preco);
    }

    /**
     * Reajusta o preço do produto com base em um percentual.
     *
     * @param percentual Percentual para reajustar o preço.
     */
    public void reajustaPreco(double percentual) {
        this.preco += this.preco * (percentual / 100);
    }

    /**
     * Retorna o último ID gerado para um produto.
     *
     * @return O último ID gerado.
     */
    public static int getUltimoId() {
        return ultimoId;
    }
}
