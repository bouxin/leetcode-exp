package com.mksense.algos1.day8;


/**
 * <a href="https://leetcode.com/problems/merge-two-binary-trees/?envType=study-plan&id=algorithm-i">Merge two binary trees</a>
 */
public class MergeTwoBinaryTrees {

    public static void main(String[] args) {
        MergeTwoBinaryTrees mtbt = new MergeTwoBinaryTrees();
        TreeNode root1 = new TreeNode();
        TreeNode root2 = new TreeNode();
        TreeNode treeNode = mtbt.mergeTreeNode(root1, root2);
        System.out.println(treeNode);
    }

    public TreeNode mergeTreeNode(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        root1.value += root2.value;

        root1.left = mergeTreeNode(root1.left, root2.left);
        root1.right = mergeTreeNode(root1.right, root2.right);

        return root1;
    }
}
