package com.mksense.algos1.day8;

/**
 * <p>
 * ...
 * </p>
 *
 * @author bouxin
 * @since 1.0
 */
public class Node {
    public int value;

    public Node left;

    public Node right;

    public Node next;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node left, Node right, Node next) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.next = next;
    }
}
