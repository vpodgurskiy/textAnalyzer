package model;

/**
 * Модель параметров запроса.
 * Может содержать дополнительные ключи, аргументы и текст для анализа.
 */
public class QueryParameters {

    public String text;
    public final boolean saveFile;

    public QueryParameters(final String text, final boolean saveFile) {
        this.text = text;
        this.saveFile = saveFile;
    }
}
