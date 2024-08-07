package org.gaurav.heap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public int findKthLargestElement(int[] nums, int k) {   
        Queue<Integer> maxHeap = new PriorityQueue<>();
        for (int n: nums) {
            maxHeap.offer(n);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
}
