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
