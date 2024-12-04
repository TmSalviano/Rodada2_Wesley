package geometria;

/**
 * Classe que representa um círculo com coordenadas, raio, área e perímetro.
 * Possui métodos para mover o círculo, aumentar o raio e calcular as propriedades geométricas.
 */
public class Circulo {
    private int x; // Coordenada X do centro do círculo
    private int y; // Coordenada Y do centro do círculo
    private double raio; // Raio do círculo

    /**
     * Construtor com parâmetros para definir as coordenadas e o raio do círculo.
     *
     * @param x Coordenada X do centro do círculo.
     * @param y Coordenada Y do centro do círculo.
     * @param raio Raio do círculo.
     */
    public Circulo(int x, int y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    /**
     * Construtor vazio que inicializa o círculo com coordenadas (0, 0) e raio 0.
     */
    public Circulo() {
        this(0, 0, 0);
    }

    /**
     * Método para calcular a área do círculo.
     * A fórmula da área é: Área = Pi * raio^2
     *
     * @return A área do círculo.
     */
    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    /**
     * Método para calcular o perímetro do círculo.
     * A fórmula do perímetro é: Perímetro = 2 * Pi * raio
     *
     * @return O perímetro do círculo.
     */
    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }

    /**
     * Método para mover o círculo horizontalmente.
     * Adiciona a quantidade especificada à coordenada x.
     *
     * @param x1 O valor a ser adicionado à coordenada x.
     */
    public void moveX(int x1) {
        this.x += x1;
    }

    /**
     * Método para mover o círculo verticalmente.
     * Adiciona a quantidade especificada à coordenada y.
     *
     * @param y1 O valor a ser adicionado à coordenada y.
     */
    public void moveY(int y1) {
        this.y += y1;
    }

    /**
     * Método para aumentar o raio do círculo.
     * O raio é multiplicado pelo valor passado como parâmetro.
     *
     * @param n O fator pelo qual o raio será multiplicado.
     */
    public void aumenta(double n) {
        this.raio *= n;
    }

    /**
     * Método para exibir as informações do círculo.
     * Exibe as coordenadas do centro, o raio, a área e o perímetro.
     *
     * @return Uma string com as informações do círculo.
     */
    public String exibe() {
        return String.format("Centro: (%d, %d)\nRaio: %.2f\nÁrea: %.2f\nPerímetro: %.2f",
                x, y, raio, calculaArea(), calculaPerimetro());
    }
}
