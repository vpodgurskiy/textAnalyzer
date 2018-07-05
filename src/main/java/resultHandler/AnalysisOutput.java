package resultHandler;

import analyzeModel.TextStatistics;

public class AnalysisOutput {
    /**
     * Метод выводит статистику анализа на экран.
     * На вход принимает статистику анализа (analyzeModel.TextStatistics)
     *
     * @param textStatistics - итоговый анализ текста.
     */
    public static void textPrinter(final TextStatistics textStatistics) {
        System.out.println();
        System.out.println(String.format("Всего символов в тексте: %s", textStatistics.getTotalChar()));
        System.out.println(String.format("Всего символов без пробелов: %s", textStatistics.getTotalCharWithoutSpaces()));
        System.out.println(String.format("Всего символов без пробелов и переносов строк: %s", textStatistics.getTotalCharWithoutSpacesAndLineBreaks()));
        System.out.println(String.format("Всего слов: %s", textStatistics.getTotalWords()));
        System.out.println();
    }
}
