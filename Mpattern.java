import java.util.Scanner;
class Mpattern
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int lines = scanner.nextInt();
        int mid = (lines - 1) / 2;
        int last = lines - 1;
        for (int i = 0; i < lines; i++)
        {
            for (int j = 0; j < lines; j++)
            {
                if (j == 0 || j == last || (i <= mid && (i == j || j == last - i)))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}

