import java.util.*;
class largestsmallestword
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        String smallest = words[0];
        String largest = words[0];
        for (String word : words)
        {
            if (word.length() < smallest.length())
            {
                smallest = word;
            }
            if (word.length() > largest.length())
            {
                largest = word;
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}
