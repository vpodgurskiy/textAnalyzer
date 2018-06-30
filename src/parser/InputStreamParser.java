package parser;

import model.QueryParameters;

/**
 * Класс отвечает за парсинг строки запроса.
 * Раскладывает запрос на ключи, параметры и сам текст,
 * который нужно проанализировать.
 * Заполняет структуру ответа и возврщает её.
 */
public class InputStreamParser {

	/**
	 *
	 * @param inputStream входная строка запроса, то что ввел пользователь.
	 * @return параметры запроса, по заданной модели.
	 */
	public static QueryParameters parseInputStream(final String inputStream) {

		boolean saveFile = false;
		if(inputStream.indexOf("-sf") != -1) {
			saveFile = true;
		}

		final String text = inputStream; //в нашем случае пока строка вводится без параметров,
										// поэтому считаем что все что ввел пользователь это текст для анализа

		QueryParameters queryParameters = new QueryParameters(text, saveFile);

		return queryParameters;
	}
}
