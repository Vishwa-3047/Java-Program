import java.util.Scanner;
class element
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int flag=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("searchelement:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println("enter a element to find:");
        int m=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(m==arr[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}