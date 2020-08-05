package com.example.demo.leetcode.test144;

import java.util.LinkedList;
import java.util.List;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static List<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println(
                new Solution().preorderTraversal(
                        new TreeNode(
                                1,
                                new TreeNode(
                                        2,
                                        new TreeNode(3),
                                        new TreeNode(
                                                4,
                                                new TreeNode(5),
                                                new TreeNode(6)
                                        )
                                ),
                                new TreeNode(5)
                        )
                )
        );
        ;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        inorder(root, list);

        return list;
    }

    void inorder(TreeNode treeNode, List list) {
        if (treeNode == null)
            return;
        list.add(treeNode.val);
        inorder(treeNode.left, list);
        inorder(treeNode.right, list);
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    TreeNode(int x, TreeNode left, TreeNode right) {
        val = x;
        this.left = left;
        this.right = right;
    }
}