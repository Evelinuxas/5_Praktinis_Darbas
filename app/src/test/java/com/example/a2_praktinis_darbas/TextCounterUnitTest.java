package com.example.a2_praktinis_darbas;

import org.junit.Test;
import static org.junit.Assert.*;

public class TextCounterUnitTest {

    // Testuoja simbolių skaičiavimą, kai tekstas yra tuščias
    @Test
    public void testGetCharsCount_emptyText() {
        String givenString = "";
        int expectedResult = 0;
        int actualResult = TextCounter.getCharsCount(givenString);
        assertEquals(expectedResult, actualResult); // Tikimės, kad simbolių bus 0
    }

    // Testuoja simbolių skaičiavimą, kai tekstas yra normalus
    @Test
    public void testGetCharsCount_normalText() {
        String givenString = "Hello, world!";
        int expectedResult = 13;
        int actualResult = TextCounter.getCharsCount(givenString);
        assertEquals(expectedResult, actualResult); // Tikimės, kad simbolių bus 13 (įskaitant tarpus ir skyrybos ženklus)
    }

    // Testuoja simbolių skaičiavimą, kai tekste yra tik tarpai
    @Test
    public void testGetCharsCount_onlySpaces() {
        String givenString = "     ";
        int expectedResult = 5;
        int actualResult = TextCounter.getCharsCount(givenString);
        assertEquals(expectedResult, actualResult); // Tikimės, kad simbolių bus 5
    }

    // Testuoja simbolių skaičiavimą, kai tekste yra tab ženklai
    @Test
    public void testGetCharsCount_onlyTabs() {
        String givenString = "\t\t\t";
        int expectedResult = 3;
        int actualResult = TextCounter.getCharsCount(givenString);
        assertEquals(expectedResult, actualResult); // Tikimės, kad simbolių bus 3
    }

    // Testuoja žodžių skaičiavimą, kai tekstas yra tuščias
    @Test
    public void testGetWordsCount_emptyText() {
        String givenString = "";
        int expectedResult = 0;
        int actualResult = TextCounter.getWordsCount(givenString);
        assertEquals(expectedResult, actualResult); // Tikimės, kad žodžių bus 0
    }

    // Testuoja žodžių skaičiavimą, kai tekstas yra normalus
    @Test
    public void testGetWordsCount_normalText() {
        String givenString = "Hello, world!";
        int expectedResult = 2;
        int actualResult = TextCounter.getWordsCount(givenString);
        assertEquals(expectedResult, actualResult); // Tikimės, kad žodžių bus 2
    }

    // Testuoja žodžių skaičiavimą, kai tekste yra tik tarpai
    @Test
    public void testGetWordsCount_onlySpaces() {
        String givenString = "     ";
        int expectedResult = 0;
        int actualResult = TextCounter.getWordsCount(givenString);
        assertEquals(expectedResult, actualResult); // Tikimės, kad žodžių bus 0
    }

    // Testuoja žodžių skaičiavimą, kai tekste yra tabuliacijos ženklai
    @Test
    public void testGetWordsCount_onlyTabs() {
        String givenString = "\t\t\t";
        int expectedResult = 0;
        int actualResult = TextCounter.getWordsCount(givenString);
        assertEquals(expectedResult, actualResult); // Tikimės, kad žodžių bus 0
    }

    // Testuoja žodžių skaičiavimą su mišria eilute
    @Test
    public void testGetWordsCount_mixedSpacesAndWords() {
        String givenString = "  Hello    world   ";
        int expectedResult = 2;
        int actualResult = TextCounter.getWordsCount(givenString);
        assertEquals(expectedResult, actualResult); // Tikimės, kad žodžių bus 2
    }
}
