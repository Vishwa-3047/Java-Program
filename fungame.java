import java.util.Scanner;

public class fungame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        if (n % 2 == 1) {
            System.out.println("Number of ways: 1");
        } else {
            int[] dp = new int[n + 1];
            dp[0] = 1;
            dp[2] = 1;

            for (int i = 4; i <= n; i += 2) {
                for (int j = 0; j <= i - 2; j += 2) {
                    dp[i] += dp[j] * dp[i - 2 - j];
                }
            }

            System.out.println("Number of ways: " + dp[n]);
        }
    }
}
