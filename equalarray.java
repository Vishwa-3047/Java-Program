import java.util.Arrays;
import java.util.Scanner;
public class equalarray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.print("Enter the elements of first array: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Enter the size of second array: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        System.out.print("Enter the elements of second array: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        boolean isEqual = Arrays.equals(arr1, arr2);

        if (isEqual) {
            System.out.println("Both arrays are equal");
        } else {
            System.out.println("Both arrays are not equal");
        }
    }
}
