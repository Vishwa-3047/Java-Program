import java.util.*;
class sumofoddfecursion
{
    public static int sumofodd(int a[],int num,int sum)
    {
        if (num >= 0)
        {
            if (a[num] % 2 != 0)
            {
                sum += a[num];
            }
            return sumofodd(a, num - 1, sum);
        }
        else {
            System.out.println("Sum = " + sum);
        }
        return  sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int  sum = 0;
        int num = sc.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++)
        {
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(sumofodd(a, num - 1, sum));
    }
}
