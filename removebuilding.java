import java.util.*;
public class removebuilding {
    public static int maxWater(int[] heights) {
        int n = heights.length;
        int maxWater = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int water = (j - i - 1) * Math.min(heights[i], heights[j]);
                if (water > maxWater) {
                    maxWater = water;
                }
            }
        }
        return maxWater;
    }

    public static void removebuilding(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the height of building " + (i+1) + ": ");
            heights[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("The maximum water that can be stored is: " + maxWater(heights));
    }
}
