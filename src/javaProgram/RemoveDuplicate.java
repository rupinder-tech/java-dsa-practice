package javaProgram;

import java.util.HashSet;

public class RemoveDuplicate{

    public static void removeDuplicates(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i< arr.length; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        System.err.println(set.toString());
    }


    public static void main(String args[]){
        int[] list = {1,1,4,8,3,6,8};
        removeDuplicates(list);
    }
}