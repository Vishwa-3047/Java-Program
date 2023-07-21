import java.util.*;
class ecommerce
{
    public  static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 1 , n2 = 1;
        int s = 0;
        for(int i=1;i<=n-2;i++)
        {
                s=n1+n2;
                n1=n2;
                n2=s;
        }
        System.out.println(s);
    }
}
