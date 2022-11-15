package com.mksense.algos1.day5;

import java.util.List;
import java.util.StringJoiner;

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 *
 * <p>
 * If there are two middle nodes, return the second middle node.
 *
 * <p>
 * Example 1:
 *      1 -> 2 -> (3) -> 4 -> 5
 *      Input: head = [1,2,3,4,5]
 *      Output: [3,4,5]
 * <p>
 * Explanation: The middle node of the list is node 3.
 *
 * <p>
 * Example 2:
 *      1 -> 2 -> (3 -> 4) -> 5 -> 6
 *      Input: head = [1,2,3,4,5,6]
 *      Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 *
 * <p>
 * Constraints:
 *      The number of nodes in the list is in the range [1, 100].
 *      1 <= Node.val <= 100
 */
public class MiddleOfTheLinkedList {

    public static void main(String[] args) {
        ListNode six = new ListNode(6, null);
        ListNode five = new ListNode(5, six);
        ListNode four = new ListNode(4, five);
        ListNode third = new ListNode(3, four);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(1, second);


        MiddleOfTheLinkedList mtll = new MiddleOfTheLinkedList();
        ListNode middleNode = mtll.middleNode(head);
        System.out.println(middleNode.toString());
    }

    public ListNode middleNode(ListNode head) {
        int end = sizeOf(head);
        int start = head != null ? 1 : 0;
        ListNode node = head;

        while (start <= end) {
            if (start == end) {
                break;
            }

            if (start + 1 == end) {
                node = node.next;
                break;
            }

            start++;
            end--;
            node = node.next;
        }

        return node;
    }

    public int sizeOf(ListNode head) {
        ListNode node = head;

        int size = 0;

        while (node != null) {
            size++;
            node = node.next;
        }

        return size;
    }
}

class ListNode {
    int val;

    ListNode next;

    public ListNode() {
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


    public String toString() {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        joiner.add(String.valueOf(val));

        ListNode temp = this.next;
        while (temp != null) {
            joiner.add(String.valueOf(temp.val));
            temp = temp.next;
        }

        return joiner.toString();
    }
}
