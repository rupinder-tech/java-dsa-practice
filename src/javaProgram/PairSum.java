package javaProgram;

import java.util.HashSet;
import java.util.Set;

public class PairSum {

    public static void findPairSum(int[] number){
        Set<Integer> set = new HashSet<>();
        int target = 7;
        for(int num: number){
            int difference = target - num;
            if(set.contains(difference)){
                System.out.println(difference +  "," + num);
            }
            set.add(num);
        }

    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 3, 5, 7, 8};
        findPairSum(numbers);
    }
}
