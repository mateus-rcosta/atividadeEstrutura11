package busca;

// Busca linear, percorrimento da lista item por item comparando os seus valores para encontrar o valor desejado
public class BuscaLinear {
    // Declaração do método para a busca linear, aceitando como o parâmetro o array a ser procurado o valor e o valor desejado
    public static int linearSearch(int[] array, int target) {
        // Laço para percorimento da lista, com o limite máximo sendo o tamanho da lista  
        for (int i = 0; i < array.length; i++) {
            // Condicional, onde pega o valor do array pelo indice gerado pelo laço de repetição e compara com o valor desejado
            if (array[i] == target) {
                // Caso tenha retorna a posição dentro do array
                return i;

            }

        }
        // Caso não tenha retorna -1, indicando que não existe no array
        return -1;

    }

}
