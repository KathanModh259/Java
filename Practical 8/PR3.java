import java.util.Map;
import java.util.TreeMap;

public class PR3 {

    public static Map<String, Integer> countWords(String text) {
        String[] words = text.toLowerCase().split("\\W+");

        Map<String, Integer> wordCountMap = new TreeMap<>();

        for (String word : words) {
            if (word.isEmpty())
                continue;
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        String text = "This is a test. This test is only a test.";

        Map<String, Integer> wordCounts = countWords(text);

        System.out.println("Word occurrences in alphabetical order:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("\nThis Practical is made by 23CS032-Kathan Kanabar");

    }
}
