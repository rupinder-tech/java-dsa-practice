package javaProgram;


import java.util.HashMap;
import java.util.Map;

public class CharCount{
    public static void charCount(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = str.toLowerCase().toCharArray();
        for(char c: arr){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }

    public static void main(String[] args) {
        String str = "HelloE";
        charCount(str);
    }
}