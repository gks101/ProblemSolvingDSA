package org.gaurav.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public int findKthLargestElement(int[] nums, int k) {
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int n: nums) {
            maxHeap.add(n);
        }
        int n = -1;
        while (k-- > 0) {
            n = maxHeap.poll();
        }
        return n;
    }
}
