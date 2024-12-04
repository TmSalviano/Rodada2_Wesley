package banco.servico;

import banco.modelo.ContaCorrente;

/**
 * Classe responsável por gerenciar uma conta corrente.
 */

public class Banco {
    private ContaCorrente conta;

    public Banco() {
        this.conta = new ContaCorrente();
    }

    public ContaCorrente getConta() {
        return conta;
    }
}
