package javaProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] list){
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: list){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] list = {"eat","tea","tan","ate","nat","bat","abcgf"};
        System.out.println(groupAnagrams(list));
    }
}
