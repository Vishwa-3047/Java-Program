import java.util.*;
class salesproduct
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        sc.close();
        int[] max_mat=new int[r];
        for(int i=0;i<r;i++)
        {
            max_mat[i]=a[i][0];
            for(int  j=0;j<c;j++)
            {
                if(a[i][j]>max_mat[i])
                {
                    max_mat[i]=a[i][j];
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            System.out.print(max_mat[i]+" ");
        }
    }
}
