package sistema.modelo;

/**
 * Representa um funcionário com atributos básicos.
 */
public class Funcionario {

    // Atributos privados para encapsulamento
    private String nome;     // Nome do funcionário
    private int idade;       // Idade do funcionário
    private String cargo;    // Cargo do funcionário
    private double salario;  // Salário do funcionário
    private String telefone; // Telefone do funcionário
    private String endereco; // Endereço do funcionário

    /**
     * Construtor padrão.
     */
    public Funcionario() {}

    /**
     * Construtor com todos os atributos.
     *
     * @param nome     Nome do funcionário
     * @param idade    Idade do funcionário
     * @param cargo    Cargo do funcionário
     * @param salario  Salário do funcionário
     * @param telefone Telefone do funcionário
     * @param endereco Endereço do funcionário
     */
    public Funcionario(String nome, int idade, String cargo, double salario, String telefone, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Exibe as informações completas do funcionário.
     */
    public void exibe() {
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d%n", idade);
        System.out.printf("Cargo: %s%n", cargo);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.printf("Telefone: %s%n", telefone);
        System.out.printf("Endereço: %s%n", endereco);
    }
}
