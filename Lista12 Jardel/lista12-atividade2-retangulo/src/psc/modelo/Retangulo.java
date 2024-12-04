package psc.modelo;

/**
 * Classe que representa um retângulo com altura e largura.
 * Oferece métodos para calcular área, perímetro e exibir informações detalhadas.
 */
public class Retangulo {

    // Atributos privados para encapsulamento
    private float altura;   // Altura do retângulo
    private float largura;  // Largura do retângulo

    /**
     * Construtor padrão que inicializa altura e largura como 0.
     */
    public Retangulo() {
        altura = 0;
        largura = 0;
    }

    /**
     * Retorna a altura do retângulo.
     *
     * @return altura do retângulo
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Define a altura do retângulo.
     *
     * @param alt nova altura do retângulo
     */
    public void setAltura(float alt) {
        altura = alt;
    }

    /**
     * Retorna a largura do retângulo.
     *
     * @return largura do retângulo
     */
    public float getLargura() {
        return largura;
    }

    /**
     * Define a largura do retângulo.
     *
     * @param larg nova largura do retângulo
     */
    public void setLargura(float larg) {
        largura = larg;
    }

    /**
     * Calcula a área do retângulo.
     *
     * @return área do retângulo (altura * largura)
     */
    public float calculaArea() {
        return altura * largura;
    }

    /**
     * Calcula o perímetro do retângulo.
     *
     * @return perímetro do retângulo (2 * altura + 2 * largura)
     */
    public float calculaPerimetro() {
        return 2 * altura + 2 * largura;
    }

    /**
     * Exibe as informações do retângulo, incluindo altura, largura, área e perímetro.
     */
    public void exibe() {
        System.out.printf("Altura: %.2f%n", altura); // Exibe a altura formatada
        System.out.printf("Largura: %.2f%n", largura); // Exibe a largura formatada
        System.out.printf("Área: %.2f%n", calculaArea()); // Exibe a área calculada
        System.out.printf("Perímetro: %.2f%n", calculaPerimetro()); // Exibe o perímetro calculado
    }
}
