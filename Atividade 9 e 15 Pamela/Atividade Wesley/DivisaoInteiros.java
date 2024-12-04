import java.util.Scanner;

public class DivisaoInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Lendo o primeiro número
            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();

            // Lendo o segundo número
            System.out.print("Digite o segundo número inteiro: ");
            int numero2 = scanner.nextInt();

            // Realizando a divisão
            int resultado = dividir(numero1, numero2);

            // Exibindo o resultado
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            // Tratamento para divisão por zero
            System.out.println("Erro: Divisão por zero não é permitida!");
        } catch (Exception e) {
            // Tratamento para outras exceções
            System.out.println("Erro: Entrada inválida.");
        } finally {
            scanner.close();
        }
    }

    // Método para dividir dois números inteiros
    public static int dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

