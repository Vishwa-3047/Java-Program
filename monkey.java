import java.util.*;
class monkey
{
    public static void main(String args[])
    {
        int n,k,j,m,p,b,s;
        int monkeys_left;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of monkeys: ");
        n = sc.nextInt();
        System.out.print("Enter the number of bananas each monkey can eat: ");
        k = sc.nextInt();
        System.out.print("Enter the number of peanuts each monkey can eat: ");
        j = sc.nextInt();
        System.out.print("Enter the total number of bananas: ");
        m = sc.nextInt();
        System.out.print("Enter the total number of peanuts: ");
        p = sc.nextInt();
        sc.close();
        monkeys_left = n;
        if(k>0 && p>0)
        {
            b=m/k;
            s=p/j;
            n=n-b-s;
        }
        else
        {
            System.out.println("Invalid:");
        }
        if((m!=0) || (p!=0))
        {
            n = n - 1;
            System.out.println("Number of Monkeys left on the Tree: " + n);
        }
    }
}