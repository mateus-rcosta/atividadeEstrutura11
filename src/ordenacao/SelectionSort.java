package ordenacao;

public class SelectionSort {
    // Definição do método para selection sort aceitando como paramêtro o array a ser percorrido
    public static void selectionSort(int[] array) {
        // Guarda o tamanho do array em uma variável
        int n = array.length;

        // Laço de repetição para percorrer o array
        for (int i = 0; i < n - 1; i++) {
            // Define a váriavel minIndex para guarda o indice do elemento percorrido do array
            int minIndex = i;

            // Laço de repetição onde começa a percorrer a partir do próximo elemento a partir do indice do loop anterior 
            for (int j = i + 1; j < n; j++) {
                // Condicional para verificar se o valor do elemento j dentro do array é menor que o elemento min idex
                if (array[j] < array[minIndex]) {
                    // Se for, minIndex é redefinido para j
                    minIndex = j;

                }

            }
            // Declaração de var temporária para guardar o valor do elemento minIndex do vetor
            int temp = array[minIndex];
            // O elemento localizado no minIndex recebe o valor do elemento localizado no indice atual do laço 
            array[minIndex] = array[i];
            // O elemento localizado no indice atual do loop no array, recebe como valor a var temp
            array[i] = temp;

        }

    }

}