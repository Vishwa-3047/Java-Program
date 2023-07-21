import java.util.Scanner;
class t3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string in lowercase:");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                sb.append(Character.toUpperCase(c));
            }
            else
            {
                sb.append(c);
            }
        }
        System.out.println("The string with vowels in uppercase is:");
        System.out.println(sb.toString());
    }
}