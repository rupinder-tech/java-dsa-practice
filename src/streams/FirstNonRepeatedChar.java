package streams;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {

    public static void findFirstNonRepeatedChar(String str){
        str.chars().
        mapToObj(c -> (char)c).
        collect(Collectors.groupingBy(
            ch -> ch,
            () -> new LinkedHashMap<>(),
            Collectors.counting()
        )).
        entrySet().
        stream().
        filter(m -> m.getValue() == 1).
        map(m -> m.getKey()).findFirst().ifPresentOrElse(
            c -> System.out.println(c), 
            () -> System.out.println("not found"));
    }

    public static void main(String[] args) {
        String str = "swwiiss";
        findFirstNonRepeatedChar(str);
    }
}
