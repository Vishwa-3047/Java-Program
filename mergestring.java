import java.util.Arrays;
import java.util.Scanner;

public class mergestring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter array1 : ");
        String input1 = scanner.nextLine();
        String[] array1 = input1.split(",");

        System.out.print("enter array2: ");
        String input2 = scanner.nextLine();
        String[] array2 = input2.split(",");

        String[] merge = new String[array1.length + array2.length];
        System.arraycopy(array1, 0, merge, 0, array1.length);
        System.arraycopy(array2, 0, merge, array1.length, array2.length);

        System.out.println("Merged Array: " + Arrays.toString(merge));
    }
}
