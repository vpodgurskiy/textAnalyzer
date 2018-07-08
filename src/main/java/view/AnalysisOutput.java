package view;

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
        System.out.println(String.format("Количество встречающихся букв: %s", textStatistics.getNumberOfCharacters()));
        System.out.println(String.format("Количество встречающихся слов: %s", textStatistics.getNumberOfWords()));
        System.out.println();
    }
}
