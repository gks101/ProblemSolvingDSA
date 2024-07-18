package org.gaurav.leetcode75;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    //Accepted Solution: Using Sorting
    public static int solution1(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);

        int maxLength = 0;
        int currentLength = 0;
        int lastNum = nums[0] - 1;
        for(int n: nums) {
            if(n == lastNum) continue;
            if(n == lastNum + 1) {
                currentLength += 1;
            } else {
                if(currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 1;
            }
            lastNum = n;
        }
        return Math.max(currentLength, maxLength);
    }

    public static void main(String[] args) {
        int[] list1 = new int[] {9,1,-3,2,4,8,3,-1,6,-2,-4,7};
        System.out.println(solution1(list1));
    }
}
