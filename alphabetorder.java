import java.util.*;
class alphabetorder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        char c[] = str.toCharArray();
        Arrays.sort(c);
        System.out.println(new String(c));
    }
}
