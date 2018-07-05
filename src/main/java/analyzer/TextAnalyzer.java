package analyzer;

import analyzeModel.TextStatistics;

public class TextAnalyzer {
    /**
     * Анализатор текста.
     * На вход принимает текст и анализирует его.
     * Возвращает структуру проделанного анализа(class analyzeModel.TextStatistics)
     *
     * @param text текст для анализа.
     * @return структура проделанного анализа, содержит итоги анализа.
     */
    public static TextStatistics textParser(final String text) {
        final int totalChar = text.length();
        final String delimiter = " ";
        final String[] words = text.split(delimiter);
        final int totalWords = words.length;

        String[] arr = text.split("");
        int totalCharWithoutSpaces = 0;
        int totalCharWithoutSpacesAndLineBreaks = 0;
        for (String item : arr) {
            if (!" ".equals(item)) {
                totalCharWithoutSpaces += 1;
            }
            if (!" ".equals(item) && !"\n".equals(item)) {
                totalCharWithoutSpacesAndLineBreaks += 1;
            }
        }
        return new TextStatistics(totalChar, totalCharWithoutSpaces, totalCharWithoutSpacesAndLineBreaks, totalWords);
    }
}