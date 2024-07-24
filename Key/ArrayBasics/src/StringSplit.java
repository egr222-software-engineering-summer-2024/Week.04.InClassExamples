import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String sentence = "The\tquick\tbrown\tfox\tjumped\tover\tthe\tlazy\tdog.";
        String[] tabDelimitedWords = sentence.split("\t");
        String[] spaceDelimitedWords = sentence.split(" ");
        System.out.println(sentence);
        System.out.print(Arrays.toString(tabDelimitedWords));
        System.out.println(" (" + tabDelimitedWords.length + " words)");
        System.out.print(Arrays.toString(spaceDelimitedWords));  // just one entry because there are no spaces
        System.out.println(" (" + spaceDelimitedWords.length + " words)");

    }
}
