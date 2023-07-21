import java.util.*;
class java
{
    public static void main(String args[])
    {
        int a[][]={{7,9,8},{6,5,4},{4,6,3}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if((i==0) && (j==1))
                {
                    System.out.print(a[0][0]+a[0][1]+a[0][2]);
                }
                else if((i==0) && (j==2))
                {
                    System.out.print(a[0][1]-a[0][2]);
                }
                else if((i==1) && (j==1))
                {
                    System.out.print(a[1][1]-a[1][2]+1);
                }
                else if((i==1) && (j==2))
                {
                    System.out.print(a[1][1]+a[1][2]-1);
                }
                else if((i==2) && (j==1))
                {
                    System.out.print(a[2][1]+a[2][2]);
                }
                else if((i==2) && (j==2))
                {
                    System.out.print(a[2][1]-a[2][2]);
                }
                else
                {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println("");
}
}
}
