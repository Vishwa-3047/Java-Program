import java.util.*;
public class spiraltraversal {
    public static String spiralTraversal(int[][] matrix) {
        int num_rows = matrix.length;
        int num_cols = matrix[0].length;
        int row_start = 0, row_end = num_rows - 1, col_start = 0, col_end = num_cols - 1;
        List<Integer> result = new ArrayList<>();

        while (row_start <= row_end && col_start <= col_end) {
            for (int i = col_start; i <= col_end; i++) {
                result.add(matrix[row_start][i]);
            }
            row_start++;
            for (int i = row_start; i <= row_end; i++) {
                result.add(matrix[i][col_end]);
            }
            col_end--;
            if (row_start <= row_end) {
                for (int i = col_end; i >= col_start; i--) {
                    result.add(matrix[row_end][i]);
                }
                row_end--;
            }
            if (col_start <= col_end) {
                for (int i = row_end; i >= row_start; i--) {
                    result.add(matrix[i][col_start]);
                }
                col_start++;
            }
        }

        return result.stream().map(String::valueOf).reduce("", (a, b) -> a + " " + b).trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_rows = sc.nextInt();
        int num_cols = sc.nextInt();
        int[][] matrix = new int[num_rows][num_cols];
        for (int i = 0; i < num_rows; i++) {
            for (int j = 0; j < num_cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        String result = spiralTraversal(matrix);
    }
}
