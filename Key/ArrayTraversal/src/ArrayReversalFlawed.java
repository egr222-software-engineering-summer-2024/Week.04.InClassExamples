import java.util.Arrays;

public class ArrayReversalFlawed {
    public static void main(String[] args) {
        int[] numbers = {11, 42, -5, 27, 0, 89};

        // reverse the array
        for (int i = 0; i < numbers.length; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(numbers));   // prints the original array
    }
}