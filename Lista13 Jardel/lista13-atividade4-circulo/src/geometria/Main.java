package geometria;

import java.util.Scanner;

/**
 * Classe principal para testar a classe Circulo.
 * Permite ao usuário interagir com o círculo e aplicar várias operações.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita as coordenadas e o raio do círculo ao usuário
        System.out.print("Informe a coordenada X do centro do círculo: ");
        int x = input.nextInt();
        System.out.print("Informe a coordenada Y do centro do círculo: ");
        int y = input.nextInt();
        System.out.print("Informe o raio do círculo: ");
        double raio = input.nextDouble();

        // Criação do objeto Circulo
        Circulo circulo = new Circulo(x, y, raio);

        // Menu de opções
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 – Mover");
            System.out.println("2 – Aumentar");
            System.out.println("3 – Imprimir");
            System.out.println("4 – Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    // Mover o círculo
                    System.out.print("Mover na direção X. Quantas unidades? ");
                    int moveX = input.nextInt();
                    circulo.moveX(moveX);
                    System.out.print("Mover na direção Y. Quantas unidades? ");
                    int moveY = input.nextInt();
                    circulo.moveY(moveY);
                    break;
                case 2:
                    // Aumentar o raio
                    System.out.print("Aumentar o raio por um fator de: ");
                    double fator = input.nextDouble();
                    circulo.aumenta(fator);
                    break;
                case 3:
                    // Imprimir as informações do círculo
                    System.out.println(circulo.exibe());
                    break;
                case 4:
                    // Sair do programa
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        input.close();
    }
}
