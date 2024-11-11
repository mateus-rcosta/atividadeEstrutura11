package ordenacao;

public class BubbleSort {
    // Definição do método para busca bubble aceitando como paramêtro o array a ser percorrido
    public static void bubbleSort(int[] array) {
        // Variável para guardar o tamanho do array
        int n = array.length;

        // Primeiro Loop para percorrimento do array
        for (int i = 0; i < n - 1; i++) {
            // Segundo Loop para percorrimento, onde para cada qual elemento do array percorre toda o array verificando se existe um maior do que ele
            for (int j = 0; j < n - 1 - i; j++) {
                // Se o próximo elemento do percorrimento for maior
                if (array[j] > array[j + 1]) {
                    // Salva o valor em uma váriavel temporária 
                    int temp = array[j];
                    // Altera o seu valor pelo valor do próximo elemento
                    array[j] = array[j + 1];
                    // O próximo elemento recebe o valor da variável temporária que guardou o seu primeiro valor
                    array[j + 1] = temp;
                }

            }

        }

    }

}