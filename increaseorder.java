import java.util.*;
class increaseorder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max=0,sum=0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        sum=arr[0];
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > arr[i - 1])
            {
                sum += arr[i];
            }
            else
            {
                if (max < sum)
                {
                    max = sum;
                }
                sum=arr[i];
            }
        }
        if(max < sum)
        {
            max = sum;
        }
        System.out.println(max);
        sc.close();
    }
}
