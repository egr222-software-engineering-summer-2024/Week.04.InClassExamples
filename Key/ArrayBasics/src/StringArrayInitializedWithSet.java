import java.util.Arrays;

public class StringArrayInitializedWithSet {
    public static void main(String[] args) {
        // array of Strings
        String[] strings = {"I", "love", "EGR222"};

        System.out.println(strings[2].length());    // prints 6
        System.out.println(strings.length);         // prints 3 (the number of array elements in the Array named strings)
        System.out.println(Arrays.toString(strings));  // prints out the array
    }
}