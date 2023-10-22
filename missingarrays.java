import java.util.*;
class missingarrays
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = scanner.nextInt();
        }
        int sum = (n + 1) * (n + 2) / 2;
        for (int i = 0; i < n; i++)
        {
            sum -= a[i];
        }
        System.out.println("The missing number is: " + sum);
        scanner.close();
    }
}
