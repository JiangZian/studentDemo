package com.example.demo.leetcode.test22;

import java.util.LinkedList;
import java.util.List;

/**
 * 输入：n = 3
 * 输出：[
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 */
public class Solution {
    static List<String> resultList = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println(generateParenthesis(1));
        System.out.println(generateParenthesis(2));
        System.out.println(generateParenthesis(3));
        System.out.println(generateParenthesis(4));
        System.out.println(generateParenthesis(5));
        System.out.println(generateParenthesis(6));

    }

    public static List<String> generateParenthesis(int n) {
        resultList.clear();

        preorderTraversal(1, 0, n, new String("("));
        return resultList;
    }

    static void preorderTraversal(int left, int right, int max, String val) {
        if (right == max && left == max) {
            resultList.add(val.toString());
            return;
        }
        if (left < max)
            preorderTraversal(left+1, right, max, val+("("));
        if (left > right)
            preorderTraversal(left, right+1, max, val+(")"));

    }


}
