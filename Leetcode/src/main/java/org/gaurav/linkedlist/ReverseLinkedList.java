package org.gaurav.linkedlist;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }

    /**
     * Question: Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
     * Solution: 2 pass solution
     * @param head Head of the linked list
     * @param left Start position from which list to be reversed
     * @param right End position till which list to be reversed
     * @return  Head of the reversed list
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode leftToLeft = null;
        ListNode rightToRight = null;
        ListNode leftNode = null;
        ListNode rightNode = null;

        if (left == right) return head;

        ListNode temp = head;
        ListNode node = null;
        int pos = 1;
        while(temp != null) {
            if (pos == left) {
                leftNode = temp;
                leftToLeft = node;
            }
            if (pos == right) {
                rightNode = temp;
                rightToRight = temp.next;
                break;
            }

            node = temp;
            temp = temp.next;
            pos = pos + 1;
        }

        ListNode reverseHead = leftNode;
        temp = leftNode;
        node = null;
        while (temp != rightToRight) {
            ListNode nextNode = temp.next;
            temp.next = node;
            node = temp;
            temp = nextNode;
        }

        if (leftToLeft != null) {
            leftToLeft.next = node;
        }
        if (reverseHead != null) {
            reverseHead.next = rightToRight;
        }

        return leftToLeft != null? head: node;
    }
}
