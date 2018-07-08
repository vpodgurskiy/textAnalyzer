package analyzer;

import analyzeModel.TextStatistics;
import org.junit.Test;
import java.util.HashMap;
import static org.junit.Assert.assertEquals;

public class TextAnalyzerTest {

    @Test
    public void textParser() {
        final String textForAnalyze = "раз, два, раз!";
        final TextStatistics textStatistics = TextAnalyzer.textParser(textForAnalyze);
        final int expectedTotalChar =  14;
        final int expectedTotalCharWithoutSpaces =  12;
        final HashMap<String, Integer> expectedNumberOfWords =  new HashMap<>();
        expectedNumberOfWords.put("раз", 2);
        expectedNumberOfWords.put("два", 1);
        final HashMap<Character, Integer> expectedNumberOfCharacters =  new HashMap<>();
        expectedNumberOfCharacters.put('р', 2);
        expectedNumberOfCharacters.put('д', 1);
        expectedNumberOfCharacters.put('а', 3);
        expectedNumberOfCharacters.put('в', 1);
        expectedNumberOfCharacters.put('з', 2);

        final int actualTotalChar = textStatistics.getTotalChar();
        final int actualTotalCharWithoutSpaces = textStatistics.getTotalCharWithoutSpaces();
        final HashMap<String, Integer> actualNumberOfWords = textStatistics.getNumberOfWords();
        final HashMap<Character, Integer> actualNumberOfCharacters = textStatistics.getNumberOfCharacters();

        assertEquals(expectedTotalChar, actualTotalChar);
        assertEquals(expectedTotalCharWithoutSpaces, actualTotalCharWithoutSpaces);
        assertEquals(expectedNumberOfWords, actualNumberOfWords);
        assertEquals(expectedNumberOfCharacters, actualNumberOfCharacters);
    }
}