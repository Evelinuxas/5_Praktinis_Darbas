package com.example.a2_praktinis_darbas;

public class TextCounter {

    // Skaičiuoja simbolių skaičių įvestame tekste
    public static int getCharsCount(String inputPhrase){
        return inputPhrase.length();
    }

    // Skaičiuoja žodžių skaičių įvestame tekste
    public static int getWordsCount(String inputPhrase) {
        // Naudojame split pagal tarpą ir filtruojame tuščius elementus
        if (inputPhrase.trim().isEmpty()) {
            return 0;
        }
        return inputPhrase.trim().split("\\s+").length;
    }
}

