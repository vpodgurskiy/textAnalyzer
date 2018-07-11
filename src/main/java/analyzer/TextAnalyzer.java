package analyzer;

import analyzeModel.TextStatistics;

import java.util.*;

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
        final int totalChar = totalChar(text);
        final int totalCharWithoutSpaces = totalCharWithoutSpaces(text);
        final TreeMap<Character, Integer> numberOfCharacters = numberOfCharacters(text);
        final TreeMap<String, Integer> numberOfWords = numberOfWords(text);

        return new TextStatistics(totalChar, totalCharWithoutSpaces, numberOfWords, numberOfCharacters);
    }

    private static int totalCharWithoutSpaces(String text) {
        String[] arr = text.split("");
        int totalCharWithoutSpaces = 0;
        for (String item : arr) {
            if (!" ".equals(item)) {
                totalCharWithoutSpaces += 1;
            }
        }
        return totalCharWithoutSpaces;
    }

    private static TreeMap<Character, Integer> numberOfCharacters(String text) {
        char[] textArr = text.toCharArray();
        List<Character> charArr = new ArrayList<Character>();
        for (char i : textArr) {
            if (Character.isLetter(i)) {
                charArr.add(Character.toLowerCase(i));
            }
        }
        TreeMap<Character, Integer> charUnique = new TreeMap<Character, Integer>();

        for (char i : charArr) {
            if (charUnique.containsKey(i)) {
                Integer value = charUnique.get(i);
                charUnique.put(i, ++value);
                continue;
            }
            charUnique.put(i, 1);
        }
        return charUnique;
    }

    private static int totalChar(String text) {
        final int totalChar = text.length();
        return totalChar;
    }

    private static TreeMap<String, Integer> numberOfWords(String text) {
        char[] textArr = text.toCharArray();
        List<Character> charArr = new ArrayList<Character>();
        for (char i : textArr) {
            if (Character.isLetter(i) || Character.isWhitespace(i)) {
                charArr.add(Character.toLowerCase(i));
            }
        }
        String str = "";
        for (int i = 0; i < charArr.size(); i++){
            str += charArr.toString().join("", String.valueOf(charArr.get(i)));

        }
        String[] strArr = str.split(" ");

        TreeMap<String, Integer> wordUnique = new TreeMap<String, Integer>();

        for (String i : strArr) {
            if (wordUnique.containsKey(i)) {
                Integer value = wordUnique.get(i);
                wordUnique.put(i, ++value);
                continue;
            }
            wordUnique.put(i, 1);
        }
        return wordUnique;
    }
}