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

		QueryParameters queryParameters = new QueryParameters();
		queryParameters.text = inputStream;

		return queryParameters;
	}
}
