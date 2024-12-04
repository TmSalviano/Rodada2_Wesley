package cadastro.controle;

import cadastro.modelo.Pessoa;
import cadastro.modelo.PessoaFisica;
import cadastro.modelo.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar o cadastro de pessoas.
 */
public class Cadastro {

    private List<Pessoa> pessoas; // Lista de pessoas cadastradas

    /**
     * Construtor que inicializa a lista de pessoas.
     */
    public Cadastro() {
        pessoas = new ArrayList<>();
    }

    /**
     * Cadastra uma pessoa na lista.
     *
     * @param pessoa Objeto da classe Pessoa a ser cadastrado.
     */
    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    /**
     * Exibe todas as pessoas cadastradas.
     */
    public void exibePessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            System.out.println("\n--- Lista de Pessoas Cadastradas ---");
            for (Pessoa pessoa : pessoas) {
                if (pessoa instanceof PessoaFisica) {
                    System.out.println("Tipo: Pessoa Física");
                    System.out.println("Nome: " + pessoa.getNome());
                    System.out.println("CPF: " + ((PessoaFisica) pessoa).getCpf());
                } else if (pessoa instanceof PessoaJuridica) {
                    System.out.println("Tipo: Pessoa Jurídica");
                    System.out.println("Nome: " + pessoa.getNome());
                    System.out.println("CNPJ: " + ((PessoaJuridica) pessoa).getCnpj());
                } else {
                    System.out.println("Tipo: Pessoa");
                    System.out.println("Nome: " + pessoa.getNome());
                }
                System.out.println("----------------------------------");
            }
        }
    }
}
