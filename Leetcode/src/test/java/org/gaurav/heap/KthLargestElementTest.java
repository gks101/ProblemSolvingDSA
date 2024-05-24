package org.gaurav.heap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthLargestElementTest {

    @Test
    public void findKthLargest_returnsCorrectValue_whenArrayIsUnsorted() {
        KthLargestElement kthLargestElement = new KthLargestElement();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int expected = 5;
        assertEquals(expected, kthLargestElement.findKthLargest(nums, k));
    }

    @Test
    public void findKthLargest_returnsCorrectValue_whenArrayIsSorted() {
        KthLargestElement kthLargestElement = new KthLargestElement();
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 1;
        int expected = 6;
        assertEquals(expected, kthLargestElement.findKthLargest(nums, k));
    }

    @Test
    public void findKthLargest_returnsCorrectValue_whenArrayHasDuplicateValues() {
        KthLargestElement kthLargestElement = new KthLargestElement();
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int expected = 4;
        assertEquals(expected, kthLargestElement.findKthLargest(nums, k));
    }

    @Test
    public void findKthLargest_returnsCorrectValue_whenArrayHasOneElement() {
        KthLargestElement kthLargestElement = new KthLargestElement();
        int[] nums = {1};
        int k = 1;
        int expected = 1;
        assertEquals(expected, kthLargestElement.findKthLargest(nums, k));
    }
}