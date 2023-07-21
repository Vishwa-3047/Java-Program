import java.util.*;
class necklace {
    static int count(int N, int L, int R)
    {
        int[][] a = new int[N][R - L + 1];
        int p = 0;
        for(int i = 0; i < N; i++) {
            a[i][0] = 1;
        }
        for(int i = 1; i < a[0].length; i++)
        {
            a[0][i] = a[0][i - 1] + 1;
        }
        p = a[0][R - L];
        for(int i = 1; i < N; i++) {
            for(int j = 1; j < a[0].length; j++)
            {
                a[i][j] = a[i - 1][j] + a[i][j - 1];
            }
            p = p+ a[i][R - L];
        }
        return p;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        System.out.print("L: ");
        int L = sc.nextInt();
        System.out.print(" R: ");
        int R = sc.nextInt();
        int result = count(N, L, R);
        System.out.println("output: " + result);
    }
}
