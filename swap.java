import java.util.*;
class swap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=1;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Scanner a=new Scanner(System.in);
        int k=a.nextInt();
        int count=0;
        for(int i=1;i<k;i++)
        {
            if(arr[i]>k)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}