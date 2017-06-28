/**
 * Created by Snake on 2017/6/28.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

import java.util.HashMap;
        import java.util.Hashtable;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        // 放值和数组下标
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        int[] ret = new int[2];

        for(int i=0; i<numbers.length; i++){
            // 对每一个数边放边查找
            if(ht.get(target-numbers[i]) != null){
                ret[0] = ht.get(target-numbers[i]) + 1;
                ret[1] = i+1;
            }else{
                ht.put(numbers[i], i);
            }
        }

        return ret;
    }
}