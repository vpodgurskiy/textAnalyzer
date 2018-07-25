package parser;

import java.util.HashMap;
import java.util.Map;

public class Options {

    HashMap<String, String> option = new HashMap<>();

    public boolean hasKey(final String key) {
        return option.containsKey(key);
    }

    public String getValueOf(final String key) {
        return option.get(key);
    }

    public void add(final String key, final String argument) {
        option.put(key, argument);
    }
}
