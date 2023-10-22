import java.util.*;
class taxbill
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] b = new long[n];
        for (int i = 0; i < n; i++)
        {
            b[i] = scanner.nextLong();
        }
        scanner.close();
        long total_tax = calctotaltax(n, b);
        System.out.println(total_tax);
    }
    public static long calctotaltax(int n, long[] b)
    {
        long total_tax = 0;
        long t = 0;
        for (int i = 0; i < n; i++)
        {
            long c = b[i];
            if (c > 1000)
            {
                t = (c - 1000) / 10;
            }
            else
            {
                t = 0;
            }
            total_tax += t;
        }
        return total_tax;
    }
}
