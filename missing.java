import java.util.*;
public class missing
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]+1!=a[i+1] && a[i]>=0)
            {
                System.out.println(a[i]+1);
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println(a[n-1]+1);
        }
    }
}