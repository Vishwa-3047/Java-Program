import java.util.*;
public class sumofevenrecursion
{
    public static int sumOfEven(int[] a, int num, int sum) {
        if (num >= 0)
        {
            if (a[num] % 2 == 0)
            {
                sum += a[num];
            }
           return sumOfEven(a, num - 1, sum);
        }
        else
        {
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
        System.out.println(sumOfEven(a, num - 1, sum));
    }
}
