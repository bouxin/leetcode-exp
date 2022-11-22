package com.mksense.algos1.day10;

import java.util.StringJoiner;

public class ListNode {
    int val;

    ListNode next;

    public ListNode() {
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode create(int[] elements) {
        ListNode head = new ListNode(elements[0], null);
        ListNode e, p = head;

        for (int i = 1; i < elements.length; i++) {
            for (;;) {
                if ((e = p.next) == null) {
                    p.next = new ListNode(elements[i], null);
                    break;
                } else {
                    p = e;
                }
            }
        }

        return head;
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
