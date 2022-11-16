package com.mksense.algos1.day5;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 *
 *
 *
 * Example 1:
 *      1 -> 2 -> 3 -> 4 -> 5
 *      1 -> 2 -> 3 -> 5
 *      Input: head = [1,2,3,4,5], n = 2
 *      Output: [1,2,3,5]
 *
 * Example 2:
 *      Input: head = [1], n = 1
 *      Output: []
 *
 * Example 3:
 *      Input: head = [1,2], n = 1
 *      Output: [1]
 *
 *
 * Constraints:
 *      The number of nodes in the list is sz.
 *      1 <= sz <= 30
 *      0 <= Node.val <= 100
 *      1 <= n <= sz
 *
 *
 * Follow up: Could you do this in one pass?
 */
public class RemoveNthNodeFromEndOfLinkedList {

    public static void main(String[] args) {
        ListNode six = new ListNode(6, null);
        ListNode five = new ListNode(5, six);
        ListNode four = new ListNode(4, five);
        ListNode third = new ListNode(3, four);
        ListNode second = new ListNode(2, null);
        ListNode head = new ListNode(1, second);

        RemoveNthNodeFromEndOfLinkedList rnfeoll = new RemoveNthNodeFromEndOfLinkedList();
        System.out.println(rnfeoll.removeNthFromEnd(head, 2).toString());
    }

    /**
     * From quo. descriptions, we know, there exists two situations of this question.
     *
     * <p>
     * Situation 1:
     *      sizeOf(head) > n, let the nth called num, so we have num = sizeOf(head) - n - 1.
     *      we name the deleting node called n1. In summarize, the num th node named n1 should be deleted.
     * Explanation: function sizeOf(head) returns the number of element within the linked list.
     *
     * <p>
     * Situation 2:
     *      sizeOf(head) == n, let the nth called num, so we have num = sizeOf(head) - n - 1.
     *      short
     *
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = sizeOf(head);
        if (n == 1 && length == 1) {
            return null;
        }

        if (n == length) {
            return head.next;
        }

        ListNode current = head;

        for (int i = 0; i < length - n - 1; i++) {
            current = current.next;
        }

        if (current != null) {
            ListNode node = current.next;
            current.next = node.next;
        }

        return head;
    }

    public int sizeOf(ListNode head) {
        int size = 0;
        ListNode node = head;

        while(node != null) {
            size++;
            node = node.next;
        }

        return size;
    }
}
