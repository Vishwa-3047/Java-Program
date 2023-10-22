import java.util.Scanner;
class dupword
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String s = sc.nextLine();
        int count = 0;
        int i = input.indexOf(s);
        while (i != -1)
        {
            count++;
            i = input.indexOf(s,  i+ 1);
        }
        System.out.println(count);
        sc.close();
    }
}