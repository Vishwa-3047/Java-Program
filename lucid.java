import java.util.*;
class lucid
{
    static int pow(int k)
    {
        for(int i=1;i<k;i++)
        {
            int m=1;
            for(int j=1;j<=i;j++)
            {
                m*=i;
            }
            if(m==k)
            {
                i=k;
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k, count = 0;
        for (int i = 1; i < n; i++)
        {
            k = n - (i * i);
            if (pow(k) == 1)
            {
                System.out.println("YES");
                count++;
            }
        }
        if (count == 0)
        {
            System.out.println("no");
        }
    }
}