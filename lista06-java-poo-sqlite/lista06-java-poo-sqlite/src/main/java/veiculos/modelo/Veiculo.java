package veiculos.modelo;

/**
 * Classe que representa um veículo.
 */
public class Veiculo {
    private String marca;
    private String modelo;
    private String numeroChassi;
    private String placa;
    private String cor;

    /**
     * Obtém a marca do veículo.
     * 
     * @return marca do veículo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define a marca do veículo.
     * 
     * @param marca marca do veículo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtém o modelo do veículo.
     * 
     * @return modelo do veículo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define o modelo do veículo.
     * 
     * @param modelo modelo do veículo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtém o número do chassi do veículo.
     * 
     * @return número do chassi.
     */
    public String getNumeroChassi() {
        return numeroChassi;
    }

    /**
     * Define o número do chassi do veículo.
     * 
     * @param numeroChassi número do chassi.
     */
    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    /**
     * Obtém a placa do veículo.
     * 
     * @return placa do veículo.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define a placa do veículo.
     * 
     * @param placa placa do veículo.
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Obtém a cor do veículo.
     * 
     * @return cor do veículo.
     */
    public String getCor() {
        return cor;
    }

    /**
     * Define a cor do veículo.
     * 
     * @param cor cor do veículo.
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
}
