package com.leetcode.arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int i = 0;
        int j = 0;
        while(i<nums.length){

            if(nums[i]==val){
                nums[j] = nums[i];
            }else{
                nums[j] = nums[i];
                j++;
            }
            i++;
        }

        for(int num:nums){
            System.out.println(num);
        }

        
        return j;

    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2));
    }

}
