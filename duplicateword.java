import java.util.*;
class duplicateword
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String words[] = n.split(" ");
        for (int i = 0; i < words.length; i++)
        {
           int count = 1;
           for (int j = i + 1; j < words.length; j++)
           {
               if (words[i].equals(words[j]))
               {
                   count++;
                   words[j] = "0";
               }
            }
            if (count > 1 && words[i] != "0")
            {
                System.out.println(words[i]);
            }
        }
        sc.close();
    }
}



