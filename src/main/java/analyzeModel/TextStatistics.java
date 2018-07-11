package analyzeModel;

import java.util.TreeMap;

public class TextStatistics {

    private final int totalChar;
    private final int totalCharWithoutSpaces;
    private final TreeMap<Character, Integer> numberOfCharacters;
    private final TreeMap<String, Integer> numberOfWords;

    public int getTotalChar() {
        return totalChar;
    }

    public int getTotalCharWithoutSpaces() {
        return totalCharWithoutSpaces;
    }

    public TreeMap<Character, Integer> getNumberOfCharacters() {
        return numberOfCharacters;
    }

    public TreeMap<String, Integer> getNumberOfWords() {
        return numberOfWords;
    }

    /**
     * Конструктор структуры анализа.
     * @param totalChar всего символов в тексте
     * @param totalCharWithoutSpaces всего символов без пробелов
     * @param numberOfWords количество встречающихся слов
     * @param numberOfCharacters количество встречающихся букв
     */
    public TextStatistics(final int totalChar, final int totalCharWithoutSpaces,
                          final TreeMap<String, Integer> numberOfWords,
                          final TreeMap<Character, Integer> numberOfCharacters) {

        this.totalChar = totalChar;
        this.totalCharWithoutSpaces = totalCharWithoutSpaces;
        this.numberOfWords = numberOfWords;
        this.numberOfCharacters = numberOfCharacters;
    }

    @Override
    public String toString() {
        String str = "\n";
        str += String.format("Всего символов в тексте: %s\n", this.getTotalChar());
        str += String.format("Всего символов без пробелов: %s\n", this.getTotalCharWithoutSpaces());
        str += String.format("Количество встречающихся букв: %s\n", this.getNumberOfCharacters());
        str += String.format("Количество встречающихся слов: %s\n", this.getNumberOfWords());
        str += "\n";

        return str;
    }
}
