import java.util.Scanner;
public class PigLatin
{
    public static boolean isVowel(char c)
    {
        return (c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c == 'u');
    }
    public static String toPigLatin(String word)
    {
        word = word.toLowerCase();
        int index = -1;
        for (int i = 0; i < word.length(); i++)
        {
            if (isVowel(word.charAt(i)))
            {
                index = i;
                break;
            }
        }
        if (index == -1)
        {
            return word;
        }
        if (index == 0)
        {
            return word + "yay";
        }
        return word.substring(index) + word.substring(0, index) + "ay";
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word : ");
        String input = sc.nextLine();
        if (input.matches("[a-z]+"))
        {
            String output = toPigLatin(input);
            System.out.println("The Pig Latin of " + input + " is " + output);
        }
		else
        {
            System.out.println("invalid input");
        }
    }
}

