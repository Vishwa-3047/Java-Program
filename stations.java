import java.util.Scanner;
public class stations {
    public static int stops(int n, int s) {
        int[][] a = new int[n+1][s+1];
        for (int i = 0; i <= n; i++) {
            a[i][0] = 1;
            a[i][1] = i;
        }
        for (int i = 2; i <= s; i++) {
            for (int j = i; j <= n; j++) {
                a[j][i] = a[j-2][i-1] + a[j-1][i];
            }
        }
        return a[n][s];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int n = sc.nextInt();
        System.out.print("s:");
        int s = sc.nextInt();
        sc.close();
        int ways = stops(n,s);
        System.out.println( ways);
    }
}
