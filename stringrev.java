import java.util.*;
class stringrev
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r="";
        int count = s.length();
        for (int i = count - 1; i >= 0; i--)
        {
            r = r + s.charAt(i);
        }
        System.out.println(r);
    }
}