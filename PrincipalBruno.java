import java.util.*;
public class Principal {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner (System.in);
        boolean continuar = true;

        //Estrutura de repetição para seleção das opções 
        while(continuar){
            System.out.println("Selecione o método de ordenação que desejas utilizar: ");
            System.out.println("1 - Bubble Sort");
            System.out.println("2 - Selection Sort");
            System.out.println("3 - Insertion Sort");
            System.out.println("4 - Quick Sort");
            System.out.println("5 - Merge Sort");
            System.out.println("Digite a opção que desejas utilizar: ");
            int escolha = keyboard.nextInt();

            int [] array = new int [10];
            System.out.println("Digite os 10 números que serão ordenados: ");
            for (int i = 0; i < 10; i++){
                array[i] = keyboard.nextInt();
            }
            //Exibindo o Array digitado pelo usuário
            System.out.println("Array original: ");

            //Importação do programa Ordenacao.java (onde está presente as declarações feitas de todos os Sorts e do printArray)
            Ordenacao.printArray(array);

            //Execução do método escolhido no While
            switch (escolha) {
                case 1:
                    Ordenacao.bubbleSort(array);
                    System.out.println("Array ordenado por Bubble Sort: ");
                    Ordenacao.printArray(array);
                    break;
                case 2:
                    Ordenacao.selectionSort(array);
                    System.out.println("Array ordenado por Selection Sort: ");
                    Ordenacao.printArray(array);
                    break;
                case 3:
                    Ordenacao.insertionSort(array);
                    System.out.println("Array ordenado por Insertion Sort: ");
                    Ordenacao.printArray(array);
                    break;
                case 4:
                    Ordenacao.quickSort(array, 0, array.length - 1);
                    System.out.println("Ordenação feita por Quick Sort: ");
                    Ordenacao.printArray(array);
                    break;
                case 5:
                    Ordenacao.mergeSort(array, 0, array.length -1);
                    System.out.println("Ordenação feita por Merge Sort: ");
                    Ordenacao.printArray(array);
                    break;
                default:
                    System.out.println("Opção inválida! Digite uma opção válida!");
            }
            //Pergunta ao usuário se ele deseja usar o programa novamente 
            System.out.println("Deseja ordenar o programa novamente ? (S/N)");
            
            //Leitura da resposta fornecida pelo usuário, aonde possui uma conversão em string e também onde obtém o primeiro caractere da string resultante//
            char resposta = keyboard.next().toLowerCase().charAt(0);

            //Aqui ele irá continuar caso a resposta seja o S, caso for o N ele dara como programa encerrado
            continuar = (resposta == 's' || resposta == 'S');
        }
        keyboard.close();
        System.out.println("Programa encerrado com sucesso!");
    }
}
