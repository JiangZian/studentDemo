package com.example.demo.leetcode.test589;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


class Solution {


    public static void main(String[] args) {
        Node node = new Node(1,
                Arrays.asList(
                        new Node(
                                3,
                                Arrays.asList(
                                        new Node(5),
                                        new Node(6))),
                        new Node(2),
                        new Node(4)
                )
        );
        System.out.println(new Solution().preorder(node));

    }

    public List<Integer> preorder(Node root) {
        LinkedList<Node> list = new LinkedList<>();
        List<Integer> stack = new LinkedList<>();
        List<Node> children = new ArrayList<>();
        if (root == null)
            return stack;
        stack.add(root.val);
        list.addAll(root.children);
        while (!list.isEmpty()) {
            Node node = list.remove(0);
            stack.add(node.val);
            children = node.children;
            if (children != null)
                for (int a = 0; a<children.size();a++){
                    list.addFirst(children.get(children.size()-1-a));
                }
        }
        return stack;
    }
}
