package org.algorithm;

public class Pangram {
    public static boolean isPangram(String frase) {
        frase = frase.toLowerCase();
        for (char letra = 'a'; letra <= 'z'; letra++) {
            if (frase.indexOf(letra) == -1) {
                return false;
            }
        }
        return true;
    }
}
