package cadastro.controle;

import cadastro.modelo.Pessoa;
import cadastro.modelo.PessoaFisica;
import cadastro.modelo.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe responsável pelo cadastro de pessoas físicas e jurídicas.
 */
public class Cadastro {

    private List<Pessoa> cadastro = new ArrayList<>();

    /**
     * Método para cadastrar uma pessoa física.
     *
     * @param nome Nome da pessoa física.
     * @param CPF CPF da pessoa física.
     */
    public void cadastrarPessoaFisica(String nome, String CPF) {
        PessoaFisica pessoaFisica = new PessoaFisica(nome, CPF);
        cadastro.add(pessoaFisica);
    }

    /**
     * Método para cadastrar uma pessoa jurídica.
     *
     * @param nome Nome da pessoa jurídica.
     * @param CNPJ CNPJ da pessoa jurídica.
     */
    public void cadastrarPessoaJuridica(String nome, String CNPJ) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, CNPJ);
        cadastro.add(pessoaJuridica);
    }

    /**
     * Método para imprimir o cadastro de pessoas.
     */
    public void imprimirCadastro() {
        for (Pessoa pessoa : cadastro) {
            System.out.println("Nome: " + pessoa.getNome());
            if (pessoa instanceof PessoaFisica) {
                System.out.println("CPF: " + ((PessoaFisica) pessoa).getCPF());
            } else if (pessoa instanceof PessoaJuridica) {
                System.out.println("CNPJ: " + ((PessoaJuridica) pessoa).getCNPJ());
            }
            System.out.println();
        }
    }
}
