package view;

import analyzeModel.TextStatistics;
import analyzer.TextAnalyzer;
import parser.*;
import java.util.*;

public class CLI {

    /**
     * main метод, ожидает строку ввода из консоли,
     * затем анализирует введенный текст и обрабатывает результат.
     * @param args
     */
    public static void main(String[] args) {

        System.out.printf("TextAnalyzer_>");
        Scanner in = new Scanner(System.in);
        final String InputStream = in.nextLine();

        CommandLineParser parser = new CommandLineParser();

        Options options = parser.parse(InputStream);

        TextAnalyzer textAnalyzer = new TextAnalyzer();
        TextStatistics textStatistics = null;

        if (options.hasKey("--h")) {
            Helper.printHelp();
            //stop
        } else if (options.hasKey("--char")) {
            final String textForAnalyze = options.getValueOf("--char");
            textStatistics = textAnalyzer.parseTextChar(textForAnalyze);
            AnalysisOutput.textPrinter(textStatistics);
        } else if (options.hasKey("--word")) {
            final String textForAnalyze = options.getValueOf("--word");
            textStatistics = textAnalyzer.parseTextWord(textForAnalyze);
            AnalysisOutput.textPrinter(textStatistics);
        } else if (options.hasKey("--quit")) {
            //quit
            //stop
        } else {
            final String textForAnalyze = InputStream;
            textStatistics = textAnalyzer.parseText(textForAnalyze);
            AnalysisOutput.textPrinter(textStatistics);
        }
    }
}
