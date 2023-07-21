import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class duplicateword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        Map<String, Integer> wordCountMap = new HashMap<>();
        sentence = sentence.trim();
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else
            {
                wordCountMap.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate word: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }
    }
}
