import java.util.Scanner;

public class CLI {

    public static void main(String[] args) {
        System.out.printf("TextAnalyzer_>");
        Scanner in = new Scanner(System.in);
        final String textForAnalyze = in.nextLine();

        final TextAnalyzer textAnalyzer = new TextAnalyzer();
        final TextStatistics textStatistics = textAnalyzer.textParser(textForAnalyze);
        final AnalysisOutput analysisOutput = new AnalysisOutput();
        analysisOutput.textPrinter(textStatistics);

    }
}
