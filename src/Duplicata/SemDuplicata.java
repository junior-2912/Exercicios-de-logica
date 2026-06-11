package Duplicata;

public class SemDuplicata {
    // Receba uma lista.
    // Retorne uma nova lista sem elementos repetidos.

    //
    public static int[] removeDuplicatas(int[] lista) {
        int[] nResultado = new int[10];
        boolean estaNoResultado;
        for (int i = 0; i < lista.length; i++) {
            for (int n : nResultado) {
                
                estaNoResultado = n == lista[i];
                if (!estaNoResultado) {
                    nResultado[i] = lista[i];
                    break;
                }
            }
        }
        return nResultado;
    }

    public static void main(String[] args) {
        int[] numeros = new int[] { 1, 1, 2, 3, 2, 4, 4 };
        int[] res = removeDuplicatas(numeros);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
