import java.util.Arrays;
import java.util.Scanner;

public class arraytriplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int count = countTriplets(array, t);
        System.out.println(count);
    }

    private static int countTriplets(int[] array, int threshold) {
        Arrays.sort(array);
        int count = 0;

        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    int sum = array[i] + array[j] + array[k];
                    if (sum <= threshold) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
        }

        return count;
    }
}
