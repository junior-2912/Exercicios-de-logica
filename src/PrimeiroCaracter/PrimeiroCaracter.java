package PrimeiroCaracter;

import java.util.ArrayList;
import java.util.List;

public class PrimeiroCaracter {
    // Receba uma palavra.
    // Retorne o primeiro caractere que aparece apenas uma vez.
    public static String buscarPrimeiro(String palavra) {
        // Preciso verificar se a letra ja apareceu antes na String
        // se ja, ela nao pode ser retornada.
        List<String> letras = new ArrayList<>();
        for (int i = 0; i < palavra.length() - 1; i++) {
            if (letras.contains(palavra.charAt(i))) {
                letras.remove(palavra.charAt(i));
            } else {
                letras.add(String.valueOf(palavra.charAt(i)));
            }
        }
        String primeiraLetra =  letras.getFirst();
        return primeiraLetra;
    }

    public static void main(String[] args) {
        String palavra1 = "leetlode";
        String palavra2 = "aabbcc";

        System.out.println(buscarPrimeiro(palavra1));
        System.out.println(buscarPrimeiro(palavra2));
    }
}
