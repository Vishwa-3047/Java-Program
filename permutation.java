import java.util.ArrayList;
import java.util.Scanner;
class permutation
{
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr)
        {
            list.add(num);
        }
        System.out.println(list);
    }

    public static void permute(int[] arr, int l, int r)
    {
        if (l == r)
        {
            printArray(arr);
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                swap(arr, l, i);
                permute(arr, l + 1, r);
                swap(arr, l, i);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        sc.close();
        permute(nums, 0, n - 1);
    }
}
