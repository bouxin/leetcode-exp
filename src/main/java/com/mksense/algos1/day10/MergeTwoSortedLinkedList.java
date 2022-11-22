package com.mksense.algos1.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href=
 * "https://leetcode.com/problems/merge-two-sorted-lists/?envType=study-plan&id=algorithm-i">
 * Merge two sorted linked list</a>
 */
public class MergeTwoSortedLinkedList {

    public static void main(String[] args) {
        ListNode list1 = ListNode.create(new int[] { 1, 2, 3, 4 });
        ListNode list2 = ListNode.create(new int[] { 1, 3, 5 });
        MergeTwoSortedLinkedList mtsll = new MergeTwoSortedLinkedList();
        ListNode head = mtsll.mergeTwoLists(list1, list2);
        System.out.println(head);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode head = new ListNode(-1, null);
        ListNode p = head;

        while ((list1 != null) && (list2 != null)) {
            if (list1.val <= list2.val) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }

        if (list1 != null) {
            p.next = list1;
        }
        if (list2 != null) {
            p.next = list2;
        }

        return head.next;
    }
}
