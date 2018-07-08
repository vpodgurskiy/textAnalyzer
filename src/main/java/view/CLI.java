package view;

import analyzer.TextAnalyzer;

import java.util.*;

public class CLI {

    public static void main(String[] args) {
        System.out.printf("TextAnalyzer_>");
        Scanner in = new Scanner(System.in);
        final String textForAnalyze = in.nextLine();

        AnalysisOutput.textPrinter(TextAnalyzer.textParser(textForAnalyze));
    }
}
