
import java.util.*;
class datafile
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0,c;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                c=a[i]%10;
                sum=sum+c;
                a[i]=a[i]/10;
            }
        }
        System.out.println(sum);
    }
}
