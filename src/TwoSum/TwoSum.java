package TwoSum;

public class TwoSum {
    // Dada uma lista de números e um alvo (target), encontre dois números cuja soma
    // seja igual ao alvo.
    public static int[] somaIgualAoAlvo(int[] numeros, int alvo) {
        int[] resultado = new int[0];

        for (int i = 0; i < numeros.length; i++) {
            //int j = i + 1 faz com que nao seja possivel somar o mesmo elemento duas vezes.
            for (int j = i + 1; j < numeros.length; j++) {
                int nAtual = numeros[i];
                int nProximo = numeros[j];

                if (nAtual + nProximo == alvo) {
                    return new int[]{nAtual, nProximo};
                }
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        // Preciso retornar uma lista só com os dois numeros que farao a soma
        // ver se a soma do numero atual com o proximo numero da o resultado
        // fazer lacos de repeticao separado, para comparar um numero com todos os outros da lista
        int[] numeros = new int[] { 3, 2, 1, 15 };
        int target = 18;
        int[] res = somaIgualAoAlvo(numeros, target);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
