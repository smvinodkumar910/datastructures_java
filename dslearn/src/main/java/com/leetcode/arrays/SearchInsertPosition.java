package com.leetcode.arrays;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        int output = -1;
        for (int i = 0; i < nums.length; i++) {

            if (output != -1) {
                break;
            }

            if (target < nums[i]) {
                output = 0;
            } else if (nums[i] == target) {

                output = i;

            } else if (i + 1 < nums.length) {

                output = (nums[i] < target && target < nums[i + 1]) ? i + 1 : -1;

            } else if (i == nums.length - 1) {

                output = i + 1;

            }

        }

        return output;

    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, 7));
    }

}
