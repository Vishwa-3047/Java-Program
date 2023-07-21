import java.util.*;
public class matrixSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix in the required format:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] < 10) {
                    System.out.print(" " + matrix[i][j] + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }

                if (j != 2) {
                    if ((matrix[i][j] + matrix[i][j+1]) % 2 == 0) {
                        System.out.print("S ");
                    } else {
                        System.out.print("D ");
                    }
                }
            }
            System.out.println();
        }
    }
}
