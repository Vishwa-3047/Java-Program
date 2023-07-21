import java.util.*;
class as
{
    public static int max(int[] heights)
    {
        int n = heights.length;
        int max = 0;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                int water = (j - i - 1) * Math.min(heights[i], heights[j]);
                if (water > max)
                {
                    max = water;
                }
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++)
        {
            heights[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("output: " + max(heights));
    }
}