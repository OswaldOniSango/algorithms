package org.algorithm;

public class Pangram {
    public static void main(String[] args) {
        String frase = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(frase);
        System.out.println(isPangram ? "Es un pangrama" : "No es un pangrama");
    }

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
