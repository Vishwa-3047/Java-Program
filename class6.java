import java.util.Scanner;

public class class6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" rows: ");
        int rows = sc.nextInt();
        System.out.print(" columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < columns; i++) {
            int sum = 0;
            for (int j = 0; j < rows; j++) {
                sum += matrix[j][i];
            }
            for (int j = 0; j < rows; j++) {
                matrix[j][i] = sum;
            }
        }

        System.out.println("Result:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
