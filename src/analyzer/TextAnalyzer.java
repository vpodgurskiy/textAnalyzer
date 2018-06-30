package analyzer;

import model.AnalysisStructure;
import model.QueryParameters;

public class TextAnalyzer {

	/**
	 * Анализатор текста.
	 * На вход принимает текст, анализирует его согласно ключам (class model.QueryParameters).
	 * Возвращает структуру анализа(class model.AnalysisStructure)
	 *
	 * @param queryParameters структура параметров, в которой содержится текст для анализа.
	 * @return структура проделанного анализа, содержит итоги анализа.
	 */

	public static AnalysisStructure analyzeText(final QueryParameters queryParameters) {

		final int totalChar = queryParameters.text.length();
		final String delimiter = " ";
		final String[] words = queryParameters.text.split(delimiter);
		final int totalWords = words.length;

		String[] arr = queryParameters.text.split("");
		int totalCharWithoutSpaces = 0;
		int totalCharWithoutSpacesOrLineBreaks = 0;
		for (String item : arr) {
			if (!" ".equals(item)) {
				totalCharWithoutSpaces += 1;
			}
			if (!" ".equals(item) && !"\n".equals(item)) {
				totalCharWithoutSpacesOrLineBreaks += 1;
			}
		}
		return new AnalysisStructure(totalChar, totalCharWithoutSpaces, totalCharWithoutSpacesOrLineBreaks, totalWords);
	}
}
