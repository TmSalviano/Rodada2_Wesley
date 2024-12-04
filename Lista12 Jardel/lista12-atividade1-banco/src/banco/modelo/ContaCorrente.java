package banco.modelo;

/**
 * Classe que representa uma Conta Corrente.
 * Demonstra os conceitos de Orientação a Objetos:
 * - **Encapsulamento**: Atributos privados só podem ser acessados ou modificados por métodos públicos.
 * - **Reusabilidade**: Métodos podem ser reutilizados em diferentes contextos no sistema.
 */
public class ContaCorrente {

    // Atributos privados que armazenam os dados da conta
    private int numero;   // Número da conta
    private int agencia;  // Número da agência
    private double saldo; // Saldo atual da conta

    /**
     * Método para inicializar os dados da conta (número e agência).
     * O saldo começa em zero por padrão.
     *
     * @param n número da conta
     * @param ag número da agência
     */
    public void iniciarContaCorrente(int n, int ag) {
        // Inicializa os atributos com os valores passados como parâmetros
        numero = n;
        agencia = ag;
        saldo = 0; // Define o saldo inicial como zero
    }

    /**
     * Método para realizar um saque na conta.
     * Valida se o saldo é suficiente antes de permitir o saque.
     *
     * @param valor valor a ser sacado
     * @return true se o saque foi realizado com sucesso; false caso contrário
     */
    public boolean sacar(double valor) {
        // Verifica se o valor do saque é maior que o saldo disponível
        if (valor > saldo) {
            // Caso o saldo seja insuficiente, exibe uma mensagem de erro
            System.out.println("Erro: Saldo insuficiente para realizar o saque.");
            return false; // Indica que o saque não foi realizado
        }
        saldo -= valor; // Subtrai o valor do saque do saldo
        return true; // Indica que o saque foi realizado com sucesso
    }

    /**
     * Método para realizar um depósito na conta.
     * Adiciona o valor informado ao saldo.
     *
     * @param valor valor a ser depositado
     */
    public void depositar(double valor) {
        saldo += valor; // Incrementa o saldo com o valor depositado
    }

    /**
     * Método para consultar o saldo atual da conta.
     *
     * @return o saldo disponível na conta
     */
    public double consultarSaldo() {
        return saldo; // Retorna o valor do saldo
    }

    /**
     * Método para exibir os dados completos da conta.
     * Mostra a agência, número da conta e saldo formatado.
     */
    public void exibe() {
        System.out.println("Agência: " + agencia); // Exibe o número da agência
        System.out.println("Conta: " + numero);    // Exibe o número da conta
        System.out.printf("Saldo: R$ %.2f%n", saldo); // Exibe o saldo com duas casas decimais
    }
}
