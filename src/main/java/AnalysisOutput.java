public class AnalysisOutput {
    /**
     * Метод выводит статистику анализа на экран.
     * На вход принимает статистику анализа (TextStatistics)
     *
     * @param textStatistics - ?
     */
    //так-же после пакеьтрования - подставить необходимый модификатор доступа.
    public void textPrinter(final TextStatistics textStatistics) {
        System.out.println();
        System.out.println(String.format("Всего символов в тексте: %s", textStatistics.totalChar));
        System.out.println(String.format("Всего символов без пробелов: %s", textStatistics.totalCharWithoutSpaces));
        System.out.println(String.format("Всего символов без пробелов и переносов строк: %s", textStatistics.totalCharWithoutSpacesAndLineBreaks));
        System.out.println(String.format("Всего слов: %s", textStatistics.totalWords));
        System.out.println();
    }
}
