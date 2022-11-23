package com.mksense.algos1.day10;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/reverse-linked-list/?envType=study-plan&id=algorithm-i">Reverse Linked List</a>
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode five = new ListNode(5, null);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode second = new ListNode(2, three);
        ListNode one = new ListNode(1, second);
        ListNode head = one;

        ReverseLinkedList rll = new ReverseLinkedList();
        ListNode reversedNode = rll.reverseList(head);

        System.out.println("original: " + one);
        System.out.println("reversed: " + reversedNode);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        Stack<ListNode> stack = toStack(head);
        if (stack.size() == 1) return head;

        stack.forEach(elem -> {
            if (elem != null) elem.next = null;
        });

        // pop the top element of stack for head node;
        ListNode newHead = stack.pop();
        ListNode e,p = newHead;

        for (;;) {
            if ((e = p.next) == null) {
                p.next = stack.pop();
                if (stack.isEmpty()) break;
            } else {
                p = e;
            }
        }

        return newHead;
    }

    public Stack<ListNode> toStack(ListNode head) {
        ListNode node = head;
        Stack<ListNode> stack = new Stack<>();

        while (node != null) {
            stack.push(node);
            node = node.next;
        }

        return stack;
    }
}
