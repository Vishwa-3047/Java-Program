import java.util.*;
class adjointmatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[5][5];
        int i, j, r1, c1, A1, A2, A3, A4, A5, A6, A7, A8, A9, d;
        int[][] A = new int[5][5];
        int B1, B2, B3, B4;
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        for (i = 1; i <= r1; i++)
        {
            for (j = 1; j <= c1; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for (i = 1; i <= r1; i++)
        {
            for (j = 1; j <= c1; j++)
            {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println();
        }
        if (r1 == 3)
        {
            A1 = (a[2][2] * a[3][3] - a[3][2] * a[2][3]);
            A2 = (a[2][3] * a[3][1] - a[2][1] * a[3][3]);
            A3 = (a[2][1] * a[3][2] - a[3][1] * a[2][2]);
            A4 = (a[1][3] * a[3][2] - a[1][2] * a[3][3]);
            A5 = (a[1][1] * a[3][3] - a[1][3] * a[3][1]);
            A6 = (a[1][2] * a[3][1] - a[1][1] * a[3][2]);
            A7 = (a[1][2] * a[2][3] - a[1][3] * a[2][2]);
            A8 = (a[1][3] * a[2][1] - a[1][1] * a[2][3]);
            A9 = (a[1][1] * a[2][2] - a[1][2] * a[2][1]);
            System.out.println("\nAdjoint of matrix A =\n\t" + A1 + "\t" + A4 + "\t" + A7 + "\n\t" + A2 + "\t" + A5 + "\t" + A8 + "\n\t" + A3 + "\t" + A6 + "\t" + A9);
            d = a[1][1] * (a[2][2] * a[3][3] - a[2][3] * a[3][2]) - a[1][2] * (a [2] [1] * a [3] [3] - a [3] [1] * a [2] [3]) + a [1] [3] * ( a [2] [1] * a [3] [2] - a [2] [2] * a [3] [1]);
            System.out.println("\nDetertiment of matrix A=" + d);
        }
        if (r1 == 2)
        {
            B1 = a [1] [1];
            B2 = a [1] [2];
            B3 = a [2] [1];
            B4 = a [2] [2];
            System.out.println("\nAdjoint of matrix A =\n\t" + B4 + "\t" + (-B2) + "\n\t" + (-B3) + "\t" + B1);
        }
        sc.close();
    }
}