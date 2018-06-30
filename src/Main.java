
import analyzer.TextAnalyzer;
import model.AnalysisStructure;
import model.QueryParameters;
import outputer.ProcessingTheResult;
import parser.InputStreamParser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.printf("Text analyzer >_ ");
        Scanner in = new Scanner(System.in);
        String inputStream = in.nextLine();

        final QueryParameters queryStringParameters = InputStreamParser.parseInputStream(inputStream);

        final AnalysisStructure analyzeStructure = TextAnalyzer.analyzeText(queryStringParameters);

        ProcessingTheResult.result(queryStringParameters, analyzeStructure);
    }
}
