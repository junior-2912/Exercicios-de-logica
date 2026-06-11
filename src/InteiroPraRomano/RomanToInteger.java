package InteiroPraRomano;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {

        Map<Character, Integer> valores = new HashMap<>();

        valores.put('I', 1);
        valores.put('V', 5);
        valores.put('X', 10);
        valores.put('L', 50);
        valores.put('C', 100);
        valores.put('D', 500);
        valores.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            int atual = valores.get(s.charAt(i));
            int proximo = valores.get(s.charAt(i + 1));

            if (atual < proximo) {
                total -= atual;
            } else {
                total += atual;
            }
        }

        total += valores.get(s.charAt(s.length() - 1));

        return total;
    }

    public static void main(String[] args) {

        System.out.println(romanToInt("III"));      // 3
        System.out.println(romanToInt("LVIII"));    // 58
        System.out.println(romanToInt("MCMXCIV"));  // 1994
    }
}