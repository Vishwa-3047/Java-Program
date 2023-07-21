import java.util.Scanner;

class t1 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 11};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number to find its next number (-1 to quit): ");
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            }

            int nextNum = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    if (i < arr.length - 1) {
                        nextNum = arr[i+1];
                    }
                    break;
                }
            }

            System.out.println("The next number after " + num + " is " + nextNum);
        }
    }
}

