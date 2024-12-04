package produtos;

import java.util.Scanner;

/**
 * Classe principal para testar a classe Produto.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Cria o primeiro produto
        System.out.println("Informe as informações para o primeiro produto:");
        System.out.print("Nome do produto: ");
        String nome1 = input.nextLine();
        System.out.print("Preço do produto: ");
        double preco1 = input.nextDouble();
        Produto produto1 = new Produto(nome1, preco1);

        // Cria o segundo produto
        input.nextLine();  // Limpa o buffer do Scanner
        System.out.println("Informe as informações para o segundo produto:");
        System.out.print("Nome do produto: ");
        String nome2 = input.nextLine();
        System.out.print("Preço do produto: ");
        double preco2 = input.nextDouble();
        Produto produto2 = new Produto(nome2, preco2);

        // Exibe informações dos produtos
        System.out.println("\nInformações dos produtos:");
        System.out.println(produto1.exibe());
        System.out.println(produto2.exibe());

        // Solicita o reajuste ao usuário
        System.out.print("\nInforme o percentual para reajustar os preços: ");
        double percentual = input.nextDouble();

        // Reajusta o preço dos produtos
        produto1.reajustaPreco(percentual);
        produto2.reajustaPreco(percentual);

        // Exibe as informações atualizadas dos produtos e o último ID gerado
        System.out.println("\nInformações atualizadas dos produtos:");
        System.out.println(produto1.exibe());
        System.out.println(produto2.exibe());
        System.out.println("Último ID gerado: " + Produto.getUltimoId());

        input.close();
    }
}
