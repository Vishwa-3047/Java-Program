import java.util.*;
class largesmall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();        
        String[] words = str.split(" ");
        
        String smallest = words[0];
        String largest = words[0];
        
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
            if (words[i].length() > largest.length()) {
                largest = words[i];
            }
        }
        
        System.out.println("Smallest word: " + smallest);
        System.out.println("Largest word: " + largest);
        
        scanner.close();
    }
}
