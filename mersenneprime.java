import java.util.*;
class mersenneprime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        int m=(2*n)-1;
        for(int i=2;i<m/2;i++)
        {
            if(m%i==0)
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("Mersenne prime");
        }
        else if(count>0)
        {
            System.out.println("Not a Mersenne prime");
        }
    }
}