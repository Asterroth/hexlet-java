package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsEx03 {
    public static void main(String[] args) {
        var text = "java and javascript are different languages";

        var index = buildIndex(text);
        System.out.println(index); // => {a=[and, are], d=[different], j=[java, javascript], l=[languages]}
    }

    public static Map<Character, List<String>> buildIndex(String text) {

        var index = new HashMap<Character, List<String>>();

        if (text.isEmpty()) {
            return index;
        }

        var words = text.split("\\s+");

        for (var word : words) {
            var firstChar = word.charAt(0);
            var innerWords = index.getOrDefault(firstChar, new ArrayList<String>());
            innerWords.add(word);
            index.put(firstChar, innerWords);
        }

        return index;

    }
}
