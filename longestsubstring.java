import java.util.Scanner;
class longestSubstring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        sc.close();
        String longest = "";
        int length = 0;
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = i + 1; j <= s.length(); j++)
            {
                String sub = s.substring(i, j);
                if (sub.length() > length)
                {
                    longest = sub;
                    length = sub.length();
                }
            }
        }
        System.out.println("longest substring is: " + longest);
        System.out.println("Length of longest substring is: " + length);
    }
}

