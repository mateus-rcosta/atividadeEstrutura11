package busca;

public class BuscaBinaria {
    // Declaração do método para a busca binária, aceitando como o parâmetro o array a ser procurado o valor e o valor desejado
    public static int binarySearch(int[] array, int target) {

        // Var para definir o lado esquerdo do vetor
        int left = 0;
        // Var para definir o lado direito do vetor
        int right = array.length - 1;

        // Laço condicional para evitar que tenha loop infinito, onde sempre vai percorrer quando o lado esquerdo do array for menor do que o direito
        while (left <= right) {
            // Calcula o meio entre o lado esquerdo e direito, 
            int middle = left + (right - left) / 2; // Evita overflow

            // Verifica se o elemento do meio é o alvo
            if (array[middle] == target) {
                // Se for retorna a posição
                return middle;

            }

            // Se o alvo é maior, ignora a metade esquerda
            if (array[middle] < target) {
                // A variável left assumi a posição do meio mais um
                left = middle + 1;

            }

            // Se o alvo é menor, ignora a metade direita
            else {
                // A variável right assumi a posição do meio mais -um
                right = middle - 1;

            }

        }

        // Retorna -1 se o elemento não foi encontrado
        return -1;

    }

}