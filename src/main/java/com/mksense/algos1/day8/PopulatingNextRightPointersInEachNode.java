package com.mksense.algos1.day8;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/populating-next-right-pointers-in-each-node/?envType=study-plan&id=algorithm-i">
 *     Populating Next Right Pointers in Each Node</a>
 *
 * @author bouxin
 * @since 1.0
 */
public class PopulatingNextRightPointersInEachNode {

    public static void main(String[] args) {
        PopulatingNextRightPointersInEachNode pnrpien = new PopulatingNextRightPointersInEachNode();
        Node root = new Node(0);
        root.left = new Node(2);
        root.right = new Node(3);
        pnrpien.connect(root);
    }

    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node right = null;
            for (int i = queue.size(); i > 0; i--) {
                Node cur = queue.poll();
                if (cur != null) {
                    cur.next = right;
                    right = cur;
                    if (cur.right != null) {
                        queue.offer(cur.right);
                        queue.offer(cur.left);
                    }
                }
            }
        }

        return root;
    }
    
    public Node connect1(Node root) {
        // TODO: 2022/11/22 Using DFS 
        return root;
    }
}
