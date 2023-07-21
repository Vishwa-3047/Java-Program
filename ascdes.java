import java.util.Arrays;
import java.util.Comparator;

public class ascdes {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 1, 8, 7, 4, 9, 6, 3};
        Integer[] oddNumbers = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(oddNumbers);
        Integer[] evenNumbers = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(evenNumbers, Comparator.reverseOrder());
        Integer[] sortedNumbers = new Integer[numbers.length];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sortedNumbers[i] = oddNumbers[oddIndex++];
            } else {
                sortedNumbers[i] = evenNumbers[evenIndex++];
            }
        }
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
