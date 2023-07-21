import java.util.*;
public class friendship {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m, i, j, l;

        n = input.nextInt();
        for (i = 1; i <= n; i++) {
            m = input.nextInt();

            for (j = 1; j <= m; j++) {
                for (l = 1; l <= j; l++) {
                    System.out.print("*");
                }

                for (l = 1; l <= (m - j) * 2; l++) {
                    System.out.print("#");
                }

                for (l = 1; l <= j; l++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            System.out.println();
        }
    }
}
