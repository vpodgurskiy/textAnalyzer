/**
 * Модель анализа текста.
 * Показывает, какие параметры включены в анализ
 */
public class AnalyzeStructure {

    int totalChar;
    int totalCharWithoutSpaces;
    int totalCharWithoutSpacesOrLineBreaks;
    int totalWords;

    /**
     * Конструктор структуры анализа.
     * @param totalChar всего символов в тексте
     * @param totalCharWithoutSpaces всего символов без пробелов
     * @param totalCharWithoutSpacesOrLineBreaks всего символов без пробелов и переносов строк
     * @param totalWords всего слов
     */
    public AnalyzeStructure(final int totalChar, final int totalCharWithoutSpaces,
                            final int totalCharWithoutSpacesOrLineBreaks, final int totalWords) {

        this.totalChar = totalChar;
        this.totalCharWithoutSpaces = totalCharWithoutSpaces;
        this.totalCharWithoutSpacesOrLineBreaks = totalCharWithoutSpacesOrLineBreaks;
        this.totalWords = totalWords;

    }

}
