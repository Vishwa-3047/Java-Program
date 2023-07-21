import java.util.*;
class fctorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int i = 0, c = 0;
        while (i < n.length())
        {
            char ch = n.charAt(i);
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')||(ch==32)))
                c++;
            i++;
        }
        System.out.println(c);
        sc.close();
    }
}

