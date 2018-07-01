public class TextStatistics {
    protected final int totalChar;
    protected final int totalCharWithoutSpaces;
    protected final int totalCharWithoutSpacesAndLineBreaks;
    protected final int totalWords;

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
