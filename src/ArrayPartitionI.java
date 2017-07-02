import java.util.Arrays;

/**
 * Created by Snake on 2017/7/2.
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i =0; i<nums.length; i +=2){
            sum += nums[i];
        }
        return sum;
    }

}