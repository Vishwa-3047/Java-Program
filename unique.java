import java.util.*;
class unique
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(unique(a));
    }
    public static int unique(int[] arr)
    {
        int result = 0;
        for (int num : arr)
        {
            result ^= num;
        }
        return result;
    }
}