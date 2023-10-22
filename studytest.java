import java.util.Scanner;
class studytest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int arr[] = new int[M];
        for (int i = 0; i < M; i++)
        {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < M; i++)
        {
            if (arr.length / 2 == 0)
            {
                int day1 = arr[i] + arr[i + 1];
                int day2 = arr[i + 2] + arr[i + 3];
                int day3 = arr[i + 4] + arr[i + 5];
                if (day1 > day2 && day1 > day3)
                {
                    System.out.println(day1);
                }
                else if (day2 > day1 && day2 > day3)
                {
                    System.out.println(day2);
                }
                else
                {
                    System.out.println(day3);
                }
            }
            else
            {
                int day1 = arr[i] + arr[i + 1];
                int day2 = arr[i + 2] + arr[i + 3];
                int day3 = arr[i + 4];
                int day4 = arr[i + 5] + arr[i + 6];
                if (day1 > day2 && day1 > day3 && day1 > day4)
                {
                    System.out.println(day1);
                }
                else if (day2 > day1 && day2 > day3 && day2 > day4)
                {
                    System.out.println(day2);
                } else
                {
                    System.out.println(day3);
                }
            }
        }
    }
}