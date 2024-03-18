package com.leetcode.arrays;


public class RemoveDuplicates {

    

    public static int removeDuplicates_old(int[] nums) {
        
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static int removeDuplicates(int[] nums) {
        
        int i = 1;
        int j = 1;
        while(i<nums.length){

            if(nums[i]!=nums[i-1]){
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
        removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
    }

   
}
