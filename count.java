import java.util.Scanner;

public class count {
    public static int countNumbers(int start, int end, int k) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 10 == k) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("start: ");
        int start = scanner.nextInt();
        System.out.print("end: ");
        int end = scanner.nextInt();
        System.out.print("k: ");
        int k = scanner.nextInt();
        scanner.close();

        int count = countNumbers(start, end, k);
        System.out.println("Count: " + count);
    }
}
