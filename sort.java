import java.util.Scanner;
class sort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (i == arr.length - 1)
            {
                System.out.println(arr[i] + "->" + -1);
            }
            else
            {
                System.out.println(arr[i] + "->" + arr[i + 1]);
            }
        }
    }
}