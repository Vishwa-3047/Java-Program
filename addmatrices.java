public class addmatrices
{

        public static void main(String[] args)
        {
            int rows = 2, columns = 3;
            int[][] a = { {2, 3, 4}, {1, 2, 3} };
            int[][] b = { {4, 5, 3}, {5, 6, 3} };

            int[][] sum = new int[rows][columns];
            for(int i = 0; i < rows; i++)
            {
                for (int j = 0; j < columns; j++)
                {
                    sum[i][j] = a[i][j] +b[i][j];
                }
            }
            System.out.println("Sum: ");
            for(int[] row : sum)
            {
                for (int column : row)
                {
                    System.out.print(column + "    ");
                }
                System.out.println();
            }
        }
}
