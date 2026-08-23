package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseLine {
    public static void reverseLine(String str){
        String[] arr = str.split(" ");
        String reversed = Arrays.stream(arr).
                            collect(Collectors.
                            collectingAndThen(
                                Collectors.toList(),
                                list -> {
                                    Collections.reverse(list);
                                    return String.join(" ", list);
                                }
                            ));
        System.out.println(reversed);
    }
    public static void main(String[] args) {
        String line = "Hi How are you";
        reverseLine(line);
    }
}
