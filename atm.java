import java.util.*;
class atm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 100 != 0)
        {
            System.out.println("Invalid");
        }
        else
        {
            int n1000 = a / 1000;
            a = a % 1000;
            int n500 = a / 500;
            a = a % 500;
            int n100 = a / 100;
            System.out.println("Total 1000 note: " + n1000);
            System.out.println("Total 500 note: " + n500);
            System.out.println("Total 100 note: " + n100);
        }
        sc.close();
    }
}
