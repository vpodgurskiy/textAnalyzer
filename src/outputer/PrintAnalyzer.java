package outputer;

import model.AnalysisStructure;

/**
 * Выводит на экран проанализированную структуру,
 * согласно модели анализа.
 */
public class PrintAnalyzer {

    public static void printAnalyzeStructure(final AnalysisStructure analyzeStructure) {
        System.out.println(String.format("Всего символов в тексте: %s", analyzeStructure.totalChar));
        System.out.println(String.format("Всего символов без пробелов: %s", analyzeStructure.totalCharWithoutSpaces));
        System.out.println(String.format("Всего символов без пробелов и переносов строк: %s", analyzeStructure.totalCharWithoutSpacesOrLineBreaks));
        System.out.println(String.format("Всего слов: %s", analyzeStructure.totalWords));
    }
}
