import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "java collections tutorial java guide";
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : text.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordCount); // {java=2, collections=1, tutorial=1, guide=1}
    }
}
