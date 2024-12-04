import java.util.Scanner;

public class Ordenacao {

    // Método de ordenação Bolha (Bubble Sort)
    public void bolha(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca de elementos se estiverem fora de ordem
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    // Método de ordenação por Seleção (Selection Sort)
    public void selecao(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            // Troca o menor elemento encontrado com o início da lista
            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
        }
    }

    // Método de ordenação por Inserção (Insertion Sort)
    public void insercao(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;
            // Move elementos maiores que a chave para frente
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
    }

    // Método principal que permite ao usuário selecionar o método de ordenação
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ordenacao ordenacao = new Ordenacao();
        
        // Estrutura de repetição para o usuário rodar o algoritmo várias vezes
        while (true) {
            // Solicitando a escolha do usuário para o método de ordenação
            System.out.println("Escolha o método de ordenação:");
            System.out.println("1. Ordenação por Bolha");
            System.out.println("2. Ordenação por Seleção");
            System.out.println("3. Ordenação por Inserção");
            System.out.println("4. Sair");
            int escolha = scanner.nextInt();

            // Se o usuário escolheu "Sair", interrompe o loop
            if (escolha == 4) {
                System.out.println("Saindo...");
                break;
            }

            // Solicitando o vetor de 10 números
            int[] vetor = new int[10];
            System.out.println("Informe 10 números para o vetor:");
            for (int i = 0; i < 10; i++) {
                vetor[i] = scanner.nextInt();
            }

            // Ordenando o vetor com base na escolha do usuário
            switch (escolha) {
                case 1:
                    ordenacao.bolha(vetor);
                    System.out.println("Vetor ordenado por Bolha:");
                    break;
                case 2:
                    ordenacao.selecao(vetor);
                    System.out.println("Vetor ordenado por Seleção:");
                    break;
                case 3:
                    ordenacao.insercao(vetor);
                    System.out.println("Vetor ordenado por Inserção:");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            // Exibindo o vetor ordenado
            for (int num : vetor) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Perguntando ao usuário se deseja executar novamente
            System.out.println("Deseja rodar novamente? (S para sim, qualquer outra tecla para não)");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("S")) {
                break;
            }
        }

        // Fechar o scanner
        scanner.close();
    }
}
