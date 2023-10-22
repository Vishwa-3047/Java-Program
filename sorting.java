import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        // Sort the words based on the second letter using bubble sort
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                String word1 = words[j];
                String word2 = words[j + 1];

                if (word1.length() > 1 && word2.length() > 1) {
                    char char1 = word1.charAt(1);
                    char char2 = word2.charAt(1);

                    if (Character.toLowerCase(char1) > Character.toLowerCase(char2)) {
                        // Swap the words
                        String temp = words[j];
                        words[j] = words[j + 1];
                        words[j + 1] = temp;
                    }
                }
            }
        }

        // Print the sorted words
        for (String word : words) {
            System.out.print(word + " ");
        }

        scanner.close();
    }
}
