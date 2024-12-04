package sistema.modelo;

/**
 * Representa um veículo com suas propriedades e métodos.
 */
public class Veiculo {

    // Atributos privados para encapsulamento
    private String marca;        // Marca do veículo
    private String modelo;       // Modelo do veículo
    private String numeroChassi; // Número do chassi do veículo
    private String placa;        // Placa do veículo
    private String cor;          // Cor do veículo

    /**
     * Construtor padrão.
     */
    public Veiculo() {}

    /**
     * Construtor com todos os atributos do veículo.
     *
     * @param marca        Marca do veículo
     * @param modelo       Modelo do veículo
     * @param numeroChassi Número do chassi do veículo
     * @param placa        Placa do veículo
     * @param cor          Cor do veículo
     */
    public Veiculo(String marca, String modelo, String numeroChassi, String placa, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroChassi = numeroChassi;
        this.placa = placa;
        this.cor = cor;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Exibe as informações completas do veículo.
     */
    public void exibe() {
        System.out.printf("Marca: %s%n", marca);
        System.out.printf("Modelo: %s%n", modelo);
        System.out.printf("Número do Chassi: %s%n", numeroChassi);
        System.out.printf("Placa: %s%n", placa);
        System.out.printf("Cor: %s%n", cor);
    }
}
