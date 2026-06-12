package Duplicata;

public class SemDuplicata {
    // Receba uma lista.
    // Retorne uma nova lista sem elementos repetidos.
    public static int[] removeDuplicatas(int[] lista) {
        int ultimoIndiceValido = -1;
        int[] nResultado = new int[lista.length];
        for (int i = 0; i < lista.length; i++) {
            // Para cada numero da lista original, verificamos se ele ja foi
            // guardado no resultado antes de adiciona-lo de novo.
            if (!estaNoResultado(nResultado, lista[i], ultimoIndiceValido)) {
                ultimoIndiceValido++;
                nResultado[ultimoIndiceValido] = lista[i];
            }

        }
        // Como o vetor de resultado foi criado com o mesmo tamanho da lista
        // original, podem sobrar posicoes sem uso. Aqui criamos um vetor menor
        // contendo somente os valores realmente preenchidos.
        int[] resSemVazios = new int[ultimoIndiceValido + 1];
        for (int i = 0; i <= ultimoIndiceValido; i++) {
            resSemVazios[i] = nResultado[i];
        }
        return resSemVazios;
    }

    public static boolean estaNoResultado(int[] resultado, int alvo, int ultimoIndiceValido) {
        // So precisamos verificar as posicoes que ja foram preenchidas.
        for (int i = 0; i <= ultimoIndiceValido; i++) {
            if (alvo == resultado[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numeros = new int[] { 1, 1, 2, 1, 2 };
        int[] res = removeDuplicatas(numeros);
        for (int i : res) {
            System.out.println(i);
        }
    }
}