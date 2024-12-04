import java.util.Scanner;

public class DivisaoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Lendo os números
            System.out.print("Digite o primeiro número (dividendo): ");
            int dividendo = scanner.nextInt();

            System.out.print("Digite o segundo número (divisor): ");
            int divisor = scanner.nextInt();

            // Realizando a divisão utilizando a classe secundária
            int resultado = Divisao.dividir(dividendo, divisor);

            // Exibindo o resultado
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            // Tratamento para erros de divisão
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            // Tratamento para outras exceções
            System.out.println("Erro: Entrada inválida.");
        } finally {
            scanner.close();
        }
    }
}

