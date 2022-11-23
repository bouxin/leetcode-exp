package com.mksense.algos1.day8;

import java.util.StringJoiner;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int value) { this.value = value; }
    TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    /**
     * 层序遍历
     * @return
     */
    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        TreeNode n = this;


        return joiner.toString();
    }
}
