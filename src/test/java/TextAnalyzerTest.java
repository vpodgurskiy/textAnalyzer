import org.junit.Test;

import static org.junit.Assert.*;

public class TextAnalyzerTest {

    @Test
    public void textParser() {
        final String text = "Текст, который надо проанализировать!!!\n";
        final TextAnalyzer textAnalyzer = new TextAnalyzer();
        final TextStatistics textStatistics = textAnalyzer.textParser(text);
        final int totalChar = 40;
        final int totalCharWithoutSpaces = 37;
        final int totalCharWithoutSpacesAndLineBreaks = 36;
        final int totalWords = 4;

        assertEquals(totalChar, textStatistics.totalChar);
        assertEquals(totalCharWithoutSpaces, textStatistics.totalCharWithoutSpaces);
        assertEquals(totalCharWithoutSpacesAndLineBreaks, textStatistics.totalCharWithoutSpacesAndLineBreaks);
        assertEquals(totalWords, textStatistics.totalWords);
    }
}