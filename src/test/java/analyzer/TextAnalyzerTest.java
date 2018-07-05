package analyzer;

import analyzeModel.TextStatistics;
import org.junit.Assert;
import org.junit.Test;

public class TextAnalyzerTest {

    @Test
    public void textParser() {
        final String text = "Текст, который надо проанализировать!!!\n";
        final TextStatistics textStatistics = TextAnalyzer.textParser(text);
        final int totalChar = 40;
        final int totalCharWithoutSpaces = 37;
        final int totalCharWithoutSpacesAndLineBreaks = 36;
        final int totalWords = 4;

        Assert.assertEquals(totalChar, textStatistics.getTotalChar());
        Assert.assertEquals(totalCharWithoutSpaces, textStatistics.getTotalCharWithoutSpaces());
        Assert.assertEquals(totalCharWithoutSpacesAndLineBreaks, textStatistics.getTotalCharWithoutSpacesAndLineBreaks());
        Assert.assertEquals(totalWords, textStatistics.getTotalWords());
    }
}