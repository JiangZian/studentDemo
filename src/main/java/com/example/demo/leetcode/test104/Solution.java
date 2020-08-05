package com.example.demo.leetcode.test104;

import sun.font.TrueTypeFont;

class Solution {
    boolean flag = true;

    public static void main(String[] args) {
        System.out.println(
                new Solution().isValidBST(
                        new TreeNode(
                                10,
                                new TreeNode(
                                        9
                                ),
                                new TreeNode(20/*,
                                        new TreeNode(15),
                                        new TreeNode(
                                                22,
                                                new TreeNode(21),
                                                new TreeNode(23))*/
                                )
                        )
                )
        );
    }


    public boolean isValidBST(TreeNode root) {
        validBST(root, root.val, true);

        return flag;
    }

    void validBST(TreeNode treeNode, int rootVal ,boolean direction) {
        if (treeNode == null) {
            flag = false;
            return;
        }
        if (direction) {
            if (rootVal < treeNode.val) {
                flag = false;
                return;
            }
        }else {
            if (rootVal > treeNode.val) {
                flag = false;
                return;
            }
        }


        rootVal = treeNode.val;
        validBST(treeNode.left, rootVal,true );
        validBST(treeNode.right, rootVal,false);
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