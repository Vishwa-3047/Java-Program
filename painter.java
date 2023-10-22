import java.util.Arrays;
import java.util.Scanner;


public class painter
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a.length==4)
            {
                int b = a[i] + a[i + 2];
                int c = a[i + 1] + a[i + 3];
                if (b >= c)
                {
                    System.out.println(b);
                }
                else
                {
                    System.out.println(c);
                }
            }
            if(a.length==2)
            {
                int b = a[i];
                int c = a[i + 1];
                if (b >= c)
                {
                    System.out.println(b);
                }
                else
                {
                    System.out.println(c);
                }
            }
        }

    }
}