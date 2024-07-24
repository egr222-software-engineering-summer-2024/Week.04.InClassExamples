import java.util.Arrays;

public class ArrayReversalMethod {
    public static void main(String[] args) {
        int[] numbers1 = {11, 42, -5, 27, 0, 89};
        int[] numbers2 = {17, 56, -23, 7, 1, -90};

        int[] numbers1_2 = reverseIntArray(numbers1);
        int[] numbers2_2 = reverseIntArray(numbers2);

        System.out.println(Arrays.toString(numbers1));   // prints reversed array
        System.out.println(Arrays.toString(numbers1_2));   // prints reversed array
        System.out.println(Arrays.toString(numbers2));   // prints reversed array
        System.out.println(Arrays.toString(numbers2_2));   // prints reversed array
    }

    public static int[] reverseIntArray(int[] numbers) {
        // reverse the array
        int [] result = Arrays.copyOf(numbers, numbers.length);
        for (int i = 0; i < result.length / 2; i++) {
            int temp = result[i];
            result[i] = result[numbers.length - 1 - i];
            result[numbers.length - 1 - i] = temp;
        }
        return result;
    }
}