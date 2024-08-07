package org.gaurav.dailyproblem;

import java.util.Arrays;

public class SortedSubarrayRangeSum {
    public static int rangeSum(int[] nums, int n, int left, int right) {
        int[] sumArray = new int[n * (n + 1) / 2];
        int k = 0;
        for(int i = 0;i < n;i++) {
            for(int j = i;j < n;j++) {
                if(i == j) {
                    sumArray[k] = nums[j];
                } else {
                    sumArray[k] = sumArray[k - 1] + nums[j];
                }
                k++;
            }
        }

        Arrays.sort(sumArray);
        int ans = 0;
        while(left < right) {
            ans += sumArray[left++];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4};
        int sum = rangeSum(arr1, 4,1, 5);
        System.out.println(sum);
    }
}
