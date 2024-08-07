package org.gaurav.interviewpreprationkit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class MaxElementAfterOperationsTest {

    @Test
    void arrayManipulation_whenMultipleOperations_returnsMaxElement() {
        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(1, 2, 100),
                Arrays.asList(2, 5, 100),
                Arrays.asList(3, 4, 100)
        );
        long result = MaxElementAfterOperations.arrayManipulation(5, queries);
        assertEquals(200, result);
    }

    @Test
    void arrayManipulation_whenSingleOperation_returnsMaxElement() {
        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(1, 5, 100)
        );
        long result = MaxElementAfterOperations.arrayManipulation(5, queries);
        assertEquals(100, result);
    }

    @Test
    void arrayManipulation_whenNoOperations_returnsZero() {
        List<List<Integer>> queries = Arrays.asList();
        long result = MaxElementAfterOperations.arrayManipulation(5, queries);
        assertEquals(0, result);
    }
}