import java.util.Scanner;

public class plumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int r = scanner.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[m];
        int sum = 0, res = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            arr[i] = arr[i] - r;
        }
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
            arr[i] = arr[i] - r;
            res += arr1[i];
        }
        int result = sum - res;
        if (result > 0) {
            System.out.print(res - sum - r);
        } else {
            System.out.println(result + r);
        }
    }
}
