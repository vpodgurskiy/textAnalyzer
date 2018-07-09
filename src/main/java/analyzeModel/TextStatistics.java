package analyzeModel;

import java.util.HashMap;

public class TextStatistics {

    private final int totalChar;
    private final int totalCharWithoutSpaces;
    private final HashMap<Character, Integer> numberOfCharacters;
    private final HashMap<String, Integer> numberOfWords;

    public int getTotalChar() {
        return totalChar;
    }

    public int getTotalCharWithoutSpaces() {
        return totalCharWithoutSpaces;
    }

    public HashMap<Character, Integer> getNumberOfCharacters() {
        return numberOfCharacters;
    }

    public HashMap<String, Integer> getNumberOfWords() {
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
                          final HashMap<String, Integer> numberOfWords,
                          final HashMap<Character, Integer> numberOfCharacters) {

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
