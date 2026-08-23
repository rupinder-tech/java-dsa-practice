package javaProgram;
public class StringCompression {

    public static void stringCompression(String str){
        StringBuilder compressed = new StringBuilder();
        int i= 0;

        while(i < str.length()){
            char current = str.charAt(i);
            int count = 0;
            while(i<str.length() && str.charAt(i) == current){
                i++;
                count++;
            }
            compressed.append(current).append(count);
        }
        System.out.println(compressed);
    }
    public static void main(String[] args) {
        stringCompression("aabbbdde");
    }
}
