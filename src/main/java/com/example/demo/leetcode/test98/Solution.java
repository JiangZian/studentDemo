package com.example.demo.leetcode.test98;

class Solution {
    int max = 0;

    public static void main(String[] args) {
        System.out.println(
                new Solution().maxDepth(
                        new TreeNode(
                                3,
                                new TreeNode(
                                        9
                                ),
                                new TreeNode(20,
                                        new TreeNode(15),
                                        new TreeNode(
                                                7,
                                                new TreeNode(8),
                                                new TreeNode(9))
                                )
                        )
                )
        );
    }

    public int maxDepth(TreeNode root) {
        inorderDepth(root, 0);

        return max;
    }

    void inorderDepth(TreeNode treeNode, int depth) {
        if (treeNode == null)
            return;
        max = Math.max(++depth, max);
        inorderDepth(treeNode.left, depth);
        inorderDepth(treeNode.right, depth);
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