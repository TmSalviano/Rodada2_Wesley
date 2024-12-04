package gerenciamento;

import java.util.Scanner;

/**
 * Classe principal para testar a classe Tempo.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Teste da classe Tempo");

        // Teste do construtor sem parâmetros
        Tempo tempo1 = new Tempo();
        System.out.println("Tempo padrão: " + tempo1.getTempoFormatado());

        // Teste do construtor com 1 parâmetro
        Tempo tempo2 = new Tempo(15);
        System.out.println("Tempo com hora definida: " + tempo2.getTempoFormatado());

        // Teste do construtor com 2 parâmetros
        Tempo tempo3 = new Tempo(10, 30);
        System.out.println("Tempo com hora e minuto definidos: " + tempo3.getTempoFormatado());

        // Teste do construtor com 3 parâmetros
        Tempo tempo4 = new Tempo(12, 45, 30);
        System.out.println("Tempo completo: " + tempo4.getTempoFormatado());

        // Configuração do tempo pelo método setTime()
        System.out.println("\nDefina um novo tempo:");
        System.out.print("Hora (0-23): ");
        int hora = input.nextInt();
        System.out.print("Minuto (0-59): ");
        int minuto = input.nextInt();
        System.out.print("Segundo (0-59): ");
        int segundo = input.nextInt();

        Tempo tempo5 = new Tempo();
        tempo5.setTime(hora, minuto, segundo);

        System.out.println("Tempo definido: " + tempo5.getTempoFormatado());

        input.close();
    }
}
