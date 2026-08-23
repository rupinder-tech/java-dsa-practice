package javaProgram;

import java.util.Map;
import java.util.stream.Collectors;

public class CharCountWithStream {

    public static void charCount(String str){
        Map<Character,Long> map = str.chars().mapToObj(c -> (char)c).
                collect(Collectors.groupingBy(c -> c,Collectors.counting()));
        System.out.println(map.toString());
    }
    public static void main(String[] args) {
        charCount("bcdba");
    }
}
