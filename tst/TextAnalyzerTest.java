import analyzer.TextAnalyzer;
import model.AnalysisStructure;
import model.QueryParameters;
import org.junit.Test;
import parser.InputStreamParser;

import static org.junit.Assert.*;

public class TextAnalyzerTest {

    @Test
    public void analyzeText() {
        final String inputStream = "Проверка текстового анализатора!\n";
        final int expected_totalChar = 33;
        final int expected_totalCharWithoutSpaces = 31;
        final int expected_totalCharWithoutSpacesOrLineBreaks = 30;
        final int expected_totalWords = 3;

        final QueryParameters queryStringParameters = InputStreamParser.parseInputStream(inputStream);
        final AnalysisStructure analyzeStructure = TextAnalyzer.analyzeText(queryStringParameters);

        assertEquals(expected_totalChar, analyzeStructure.totalChar);
        assertEquals(expected_totalCharWithoutSpaces, analyzeStructure.totalCharWithoutSpaces);
        assertEquals(expected_totalCharWithoutSpacesOrLineBreaks, analyzeStructure.totalCharWithoutSpacesOrLineBreaks);
        assertEquals(expected_totalWords, analyzeStructure.totalWords);
    }
}
