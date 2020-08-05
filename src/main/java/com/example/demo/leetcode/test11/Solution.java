package com.example.demo.leetcode.test11;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{1,2,6,2,5,4,8,3,3}));
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,1}));
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,1,3,1}));
    }

    public static int maxArea(int[] height) {
        int left = 0,right = height.length -1,sum=0;
        while (left != right){
            sum= Math.max(sum,Math.min(height[left] , height[right])* (right-left)) ;
            if (height[left]<height[right]){
                left++;
            }else
                right--;
        }
        return sum;
    }
}
