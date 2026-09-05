package javaProgram;
public class StringDecompress {

    public static void stringDecompress(String str){
        StringBuilder decompressed = new StringBuilder();
        for(int i=0; i< str.length(); i= i+2){
            char c = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i+1));
            for(int j=0; j<count; j++){
                decompressed.append(c);
            }
        }
        System.out.println(decompressed);
    }
    public static void main(String[] args) {
        stringDecompress("a3b5n2");
    }
}
