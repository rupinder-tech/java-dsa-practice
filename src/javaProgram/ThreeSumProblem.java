package javaProgram;

import java.util.ArrayList;
import java.util.List;

public class ThreeSumProblem {

    static void findSubsets(int[] nums, int target){
        List<Integer> current = new ArrayList<>();
        backtrace(nums, 0, target, current);
    }

    static void backtrace(int[] nums, int index, int target, List<Integer> current){
        if(target == 0){
            System.out.println(current);
            return;
        }
        if(index == nums.length){
            return;
        }
        current.add(nums[index]);
        backtrace(nums, index+1, target-nums[index], current);

        current.remove(current.size()-1);
        backtrace(nums, index+1, target, current);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,-1};
        findSubsets(nums, 3);
    }
}
