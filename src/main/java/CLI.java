import java.util.Scanner;

public class CLI {

    public static void main(String[] args) {
        System.out.println("TextAnalyzer_>");
        Scanner in = new Scanner(System.in);
        final String textForAnalyze = in.nextLine();

        final TextAnalyzer textAnalyzer = new TextAnalyzer();
        final TextStatistics textStatistics = textAnalyzer.textParser(textForAnalyze);
        final AnalysisOutput analysisOutput = new AnalysisOutput();
        analysisOutput.textPrinter(textStatistics);
        /*
        Если б в остальных классах были конструкторы или они были полностью static
        то меньше бы было писанины с присваиваниями.
        Можно бы было написать одной строкой, например:
        AnalysisOutput.textPrinter(TextAnalyzer.textParser(textForAnalyze));

        Но нужно ли тебе делать те классы статическими или писать в них конструкторы - решать тебе.

         */

    }
}
