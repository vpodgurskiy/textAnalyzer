package view;

import analyzer.TextAnalyzer;
import resultHandler.AnalysisOutput;

import java.util.Scanner;

public class CLI {

    public static void main(String[] args) {
        System.out.printf("TextAnalyzer_>");
        Scanner in = new Scanner(System.in);
        final String textForAnalyze = in.nextLine();

        AnalysisOutput.textPrinter(TextAnalyzer.textParser(textForAnalyze));
    }
}
