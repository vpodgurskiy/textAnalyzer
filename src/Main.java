
import analyzer.TextAnalyzer;
import model.AnalysisStructure;
import model.QueryParameters;
import outputer.ProcessingTheResult;
import parser.InputStreamParser;

public class Main {

    public static void main(String[] args) {

        String inputStream = String.join(" ", args);

        final QueryParameters queryStringParameters = InputStreamParser.parseInputStream(inputStream);

        final AnalysisStructure analyzeStructure = TextAnalyzer.analyzeText(queryStringParameters);

        ProcessingTheResult.result(queryStringParameters, analyzeStructure);
    }
}
