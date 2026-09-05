package javaProgram;

public class OddDivisors {

    public static long findOddDivisors(int[] arr){
        long count = 0;
        for(int i=0; i< arr.length; i++){
            long product = 1;
            for(int j=i; j< arr.length; j++){
                product = product * arr[j];
                long sqrt = (long)Math.sqrt(product);
                if(sqrt*sqrt == product){
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,2,3};
        System.err.println(findOddDivisors(arr));
    }
}
