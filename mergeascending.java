import java.util.*;

public class mergeascending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter array1: ");
        String[] arr1Str = input.nextLine().split(",");
        int[] arr1 = new int[arr1Str.length];
        for (int i = 0; i < arr1Str.length; i++) {
            arr1[i] = Integer.parseInt(arr1Str[i].trim());
        }

        System.out.print("enter array2: ");
        String[] arr2Str = input.nextLine().split(",");
        int[] arr2 = new int[arr2Str.length];
        for (int i = 0; i < arr2Str.length; i++) {
            arr2[i] = Integer.parseInt(arr2Str[i].trim());
        }

        int[] merge = sort(arr1, arr2);
        System.out.print("merged array =");
        for (int i = 0; i < merge.length; i++) {
            if (i == merge.length - 1) {
                System.out.print(merge[i] );
            } else {
                System.out.print(merge[i] + ", ");
            }
        }
    }
    public static int[] sort(int[] arr1, int[] arr2) {
        int[] merge = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merge, 0, arr1.length);
        System.arraycopy(arr2, 0, merge, arr1.length, arr2.length);
        Arrays.sort(merge);
        return merge;
    }
}
