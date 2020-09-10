package test;

import java.util.Map;
import java.util.Scanner;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/8/8
 * \* Time: 14:56
 * \* Description: www.diandian.在线
 * \* 功能说明：两个数字之和
 * \
 */
public class Test {
    public static void main(String[] args) {
        int demo[]={2,3435,6,24,2,4};
        int[] newtest=new Solution().twoSum(demo,6);
        for (int i=0; i<newtest.length;i++){
            System.out.println(newtest[i]);
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
