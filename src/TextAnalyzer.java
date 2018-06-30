
public class TextAnalyzer {

	/**
	 * Анализатор текста.
	 * На вход принимает текст, анализирует его согласно ключам (class QueryParameters).
	 * Возвращает структуру анализа(class AnalyzeStructure)
	 *
	 * @param  text который нужно проанализировать с помощью выбранной модели анализа.
	 * @return структура проделанного анализа, содержит итоги анализа.
	 */

	public static AnalyzeStructure analyzeText(final String text) {

		final int totalChar = text.length();

		final String delimiter = " ";
		final String [] words = text.split(delimiter);
		final int totalWords = words.length;


		String[] arr = text.split("");
		int totalCharWithoutSpaces = 0;
		int totalCharWithoutSpacesOrLineBreaks = 0;
		for (int i = 0; i < arr.length; i++) {
			if(!" ".equals(arr[i])) {
				totalCharWithoutSpaces += 1;
			}
			if(!" ".equals(arr[i]) && !"\n".equals(arr[i])) {
				totalCharWithoutSpacesOrLineBreaks += 1;
			}
		}

		return new AnalyzeStructure(totalChar, totalCharWithoutSpaces, totalCharWithoutSpacesOrLineBreaks, totalWords);
	}
}
