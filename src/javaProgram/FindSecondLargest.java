package javaProgram;
public class FindSecondLargest {

    public static int findSecondLargest(int[] arr) {
        int secondLarget = Integer.MIN_VALUE;
        int length = arr.length;
        int largest = arr[0];

        for(int i=1; i<length; i++){
            if(largest < arr[i]){
                secondLarget = largest;
                largest = arr[i];          
            }
            else if(arr[i] > secondLarget && arr[i] != largest){
                secondLarget = arr[i];
            }
        }
        return secondLarget;
    }
    public static void main(String[] args) {
        int[] numbers = {7, 2, 10, 1,5,9};
        int secondLargest = findSecondLargest(numbers);
        System.out.println("The second largest number is: " + secondLargest);
    }
}