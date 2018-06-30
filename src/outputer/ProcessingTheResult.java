package outputer;

import model.AnalysisStructure;
import model.QueryParameters;

public class ProcessingTheResult {
    public static void result(final QueryParameters queryParameters, final AnalysisStructure analysisStructure) {
        if(!queryParameters.saveFile) {
            PrintAnalyzer.printAnalyzeStructure(analysisStructure);
        }
    }
}
