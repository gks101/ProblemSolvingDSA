package org.gaurav.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void reverseList_whenListHasMultipleNodes_returnsReversed() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode result = reverseLinkedList.reverseList(head);
        assertEquals(3, result.val);
        assertEquals(2, result.next.val);
        assertEquals(1, result.next.next.val);
    }

    @Test
    void reverseList_whenListHasSingleNodes_returnsSameNode() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode head = new ListNode(1);
        ListNode result = reverseLinkedList.reverseList(head);
        assertEquals(1, result.val);
        assertNull(result.next);
    }

    @Test
    void reverseList_whenListIsEmpty_returnsNull() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode head = null;
        ListNode result = reverseLinkedList.reverseList(head);
        assertNull(result);
    }
}