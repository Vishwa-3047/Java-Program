import java.util.Scanner;

public class groundmaze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] maze = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                maze[i][j] = input.nextInt();
            }
        }
        int[][] dp = new int[n][n];
        dp[0][0] = 0;
        for(int i = 1; i < n; i++) {
            if(maze[0][i] == 0) {
                dp[0][i] = dp[0][i - 1] + 1;
            } else {
                dp[0][i] = Integer.MAX_VALUE;
            }
            if(maze[i][0] == 0) {
                dp[i][0] = dp[i - 1][0] + 1;
            } else {
                dp[i][0] = Integer.MAX_VALUE;
            }
        }
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < n; j++) {
                if(maze[i][j] == 1) {
                    dp[i][j] = Integer.MAX_VALUE;
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                    if(i == j && maze[i - 1][j - 1] == 0) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + 1);
                    }
                }
            }
        }
        System.out.println(dp[n - 1][n - 1]);
    }
}
