package streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {

    public static void reverseWords(String str){
        String[] arr = str.split(" ");
        String reversed = Arrays.stream(arr).
                            map(word -> new StringBuilder(word).reverse().toString()).
                            collect(Collectors.joining(" "));
        System.out.println(reversed);
    }
    public static void main(String[] args) {
        String sentence = "Java Stream Interview";
        reverseWords(sentence);
    }
}
