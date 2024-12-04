package psc.aplicacao;

import psc.modelo.Retangulo;
import java.util.Scanner;

/**
 * Classe principal para testar as funcionalidades da classe Retangulo.
 */
public class Main {

    public static void main(String[] args) {
        // Cria uma instância da classe Retangulo
        Retangulo ret = new Retangulo();

        // Scanner para entrada de dados do usuário
        Scanner input = new Scanner(System.in);

        // Solicita ao usuário a altura do retângulo
        System.out.print("Informe a altura do retângulo: ");
        ret.setAltura(input.nextFloat()); // Define a altura no objeto

        // Solicita ao usuário a largura do retângulo
        System.out.print("Informe a largura do retângulo: ");
        ret.setLargura(input.nextFloat()); // Define a largura no objeto

        // Exibe as informações do retângulo
        System.out.println("\n--- Informações do Retângulo ---");
        ret.exibe(); // Chama o método exibe para mostrar as informações formatadas

        // Fecha o scanner para liberar recursos
        input.close();
    }
}
