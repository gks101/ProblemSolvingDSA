package org.gaurav.interviewpreprationkit;

import java.util.Comparator;
import java.util.List;

/**
 * HackerRank Array Manipulation:
 * <a href="https://www.hackerrank.com/challenges/crush/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays">...</a>
 */
public class MaxElementAfterOperations {
    /**
     * queries contains a list of list. Each element list contains 3 elements. 3rd element is the value to be added to the array
     * from index 1st element to index 2nd element in the 1-indexed array. After all the operations are performed, maximum element
     * in the array to be returned
     * @param n Number of elements in the array
     * @param queries List of operations to be performed
     * @return  Maximum element after all the operations are performed
     */
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] arr = new long[n];
        for(List<Integer> q: queries) {
            for(int i = q.get(0) - 1;i < q.get(1);i++) {
                arr[i] += (long) q.get(2);
            }
        }
        long max = Long.MIN_VALUE;
        for(long i: arr) {
            if(i > max) {
                max = i;
            }
        }
        return max;
    }

/*    public static long findMaxElement(int n, List<List<Integer>> queries) {
        long ans = Long.MIN_VALUE;

        int[] range = {-1, -1};
        queries.sort(Comparator.comparingInt(a -> a.get(1)));

        for (List<Integer> q: queries) {
            if (range[0] == -1) {
                range[0] = q.get(0);
                range[1] = q.get(1);
                ans = q.get(2);
            } else {
                if (q.get(0) <= range[1]) {
                    ans += q.get()
                }
            }
        }
    }*/
}
