import java.util.*;

public class Ordenacao {
    //Bubble Sort

public static void bubbleSort(int [] array) {
    int n = array.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i -1; j++){
                if(array[j] > array [j + 1]) {
                    int temp = array[j];
                    array[j] = array [j + 1];
                    array[j + 1 ] = temp;
                }
            }
        }
    }
    //Selection Sort
    public static void selectionSort (int [] array) {
        int n = array.length;
        for(int i = 0; i < n - 1; i ++){
            int minIndex = i;
            for(int j = i + 1; j < n; j ++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    //Insertion Sort
    public static void insertionSort (int [] array) {
        int n = array.length;
        for(int i = 1; i < n; i++){
            int key = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > key){
                array[ j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    //Quick Sort
    public static void quickSort(int [] array, int low, int high){
        if (low < high){
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
    private static int partition(int [] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for(int j = low; j < high; j ++) {
            if (array[j] <= pivot) {
                i ++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[ i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    //Marge Sort
    public static void mergeSort(int [] array, int left, int right){
        if(left < right){
            int middle = (left + right) / 2;

            //Divião da primeira e da segunda metade
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            //Mesclando as metades ordenadas
            merge(array, left, middle, right);
        }
    }

    private static void merge(int [] array, int left, int middle, int right){
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i = 0; i < n1; i++){
            leftArray[i] = array[left + i];
        }
        for(int j = 0; j < n2; j ++){
            rightArray[j] = array[middle + 1 + j];
        }
        int i = 0, j = 0;
        int k = left;
        while(i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]){
                array[k] = leftArray[i];
                i ++;
            }else{
                array[k] = rightArray[j];
                j ++;
            }
            k ++;
            
        }
        //Copia os elementos restantes do left Array caso haja
        while(i < n1){
            array[k] = leftArray[i];
            i ++;
            k ++;
        }
        
        //Copia os elementos restantes do left Array caso haja
        while(j < n2) {
            array[k] = rightArray[j];
            j ++;
            k ++;
        }
    }
    //Metódo de exibição do Array
    public static void printArray(int [] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    //Exibição dos arrays (Serão exibidos separadamente)
    //Método principal
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);

        //Entrada das informações do usuário para informar o tamanho do array
        System.out.println("Digite o número de elementos que estarão presente neste Array: ");
        int n = keyboard.nextInt();
        int [] array = new int [n];

        //Entrada do usuário para informar os números que estarão presentes no array
        System.out.println("Digite os números que estarão presentes dentro do array");
        for(int i =0; i < n; i ++) {
            array[i] = keyboard.nextInt();
        }

        //Exibindo o array ("original") que foi informado pelo usuário(SEM A APLICAÇÃO DAS SORTS)
        System.out.println("Array original: ");
        printArray(array);

        //Exibindo o array com bubble sort
        int [] bubbleSorted = array.clone();
        bubbleSort(bubbleSorted);
        System.out.println("Ordenado com Bubble Sort: ");
        printArray(bubbleSorted);

        //Exibindo o array com Selection Sort
        int [] selectionSorted = array.clone();
        selectionSort(selectionSorted);
        System.out.println("Ordenado pelo Selection Sort: ");
        printArray(selectionSorted);

        //Exibindo pelo Insertion Sort
        int[] insertionSorted = array.clone();
        insertionSort(insertionSorted);
        System.out.println("Ordenado pelo Insertion Sort: ");
        printArray(insertionSorted);

        //Exibindo pelo QuickSort
        int[] quickSorted = array.clone();
        quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("Ordenado pelo Quick Sort: ");
        printArray(quickSorted);

        //Exibindo pelo Marge Sort
        int[] mergeSorted = array.clone();
        mergeSort(mergeSorted, 0, mergeSorted.length - 1);
        System.out.println("Ordenado pelo Marge Sort: ");
        printArray(mergeSorted);

        keyboard.close();
    }
}