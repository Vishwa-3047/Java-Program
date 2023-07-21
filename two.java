import java.util.Arrays;
import java.util.Scanner;
class two
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]={5,7,1,2,8,4,3};
        int l=arr.length;
        for(int i=0;i<l-1;i++)
        {
            for (int j = i + 1; j < l; j++)
            {
                if (arr[i] + arr[j] == n)
                {
                    System.out.print(arr[i] + "+" + arr[j] + "=" + n);
                }
            }
            System.out.println();
        }
   }
}
