package com.mksense.algos1.day8;


/**
 * <a href="https://leetcode.com/problems/merge-two-binary-trees/?envType=study-plan&id=algorithm-i"></a>
 *
 * @author bouxin
 * @since 1.0
 */
public class MergeTwoBinaryTrees {

    public static void main(String[] args) {
        MergeTwoBinaryTrees mtbt = new MergeTwoBinaryTrees();
        TreeNode root1 = getRoot1();
        TreeNode root2 = getRoot2();
        TreeNode root = mtbt.mergeTrees(root1, root2);
        System.out.println(root);
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        // plus the same level node value
        root1.value += root2.value;

        /*
        recursively invoke mergeTrees(r1,r2) to execute the step "plus the same level node value".
        therefore, the left subtree and right subtree merged by plus action recursively while every
        subtree reach the null leaf node.
         */
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

        return root1;
    }

    public static TreeNode getRoot1() {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode five = new TreeNode(5);

        root.left = three; root.right = two;
        three.left = five;

        return root;
    }

    public static TreeNode getRoot2() {
        TreeNode root = new TreeNode(2);
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode seven = new TreeNode(7);

        root.left = one; root.right = three;
        one.right = four;
        three.right = seven;

        return root;
    }
}
