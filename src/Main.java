
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.printf("Text analyzer >_ ");
        Scanner in = new Scanner(System.in);
        String inputStream = in.nextLine();

        final QueryParameters queryStringParameters = InputStreamParser.parseInputStream(inputStream);

        final AnalyzeStructure analyzeStructure = TextAnalyzer.analyzeText(queryStringParameters.text);

        PrintAnalyzer.printAnalyzeStructure(analyzeStructure);

    }
}
