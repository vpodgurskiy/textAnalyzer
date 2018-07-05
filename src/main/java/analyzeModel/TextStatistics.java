package analyzeModel;

public class TextStatistics {

    private final int totalChar;
    private final int totalCharWithoutSpaces;
    private final int totalCharWithoutSpacesAndLineBreaks;
    private final int totalWords;

    public int getTotalChar() {
        return totalChar;
    }

    public int getTotalCharWithoutSpaces() {
        return totalCharWithoutSpaces;
    }

    public int getTotalCharWithoutSpacesAndLineBreaks() {
        return totalCharWithoutSpacesAndLineBreaks;
    }

    public int getTotalWords() {
        return totalWords;
    }

    /**
     * Конструктор структуры анализа.
     * @param totalChar всего символов в тексте
     * @param totalCharWithoutSpaces всего символов без пробелов
     * @param totalCharWithoutSpacesOrLineBreaks всего символов без пробелов и переносов строк
     * @param totalWords всего слов
     */
    public TextStatistics(final int totalChar, final int totalCharWithoutSpaces,
                          final int totalCharWithoutSpacesOrLineBreaks, final int totalWords) {

        this.totalChar = totalChar;
        this.totalCharWithoutSpaces = totalCharWithoutSpaces;
        this.totalCharWithoutSpacesAndLineBreaks = totalCharWithoutSpacesOrLineBreaks;
        this.totalWords = totalWords;

    }
}
