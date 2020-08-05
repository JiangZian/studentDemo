package com.example.demo.leetcode.test26;

import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> cacheSet = new TreeSet();
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (cacheSet.contains(nums[i])) {
                continue;
            } else{
                nums[a++] = nums[i];
                cacheSet.add(nums[i]);
            }
        }
        return cacheSet.size();

    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
        Arrays.stream(nums).forEach(f -> System.out.print(f + ","));
        System.out.println();
        int[] nums1 = new int[]{1,1,2};
        System.out.println(removeDuplicates(nums1));
        Arrays.stream(nums1).forEach(f -> System.out.print(f + ","));
    }
}
