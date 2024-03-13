package com.dailycodebuffer;

public class UniqueIntegerFinder {
    public static int findUniqueInteger(int[] nums) {
        int uniqueInteger = 0;
        for (int num : nums) {
            uniqueInteger ^= num;
        }
        return uniqueInteger;
    }
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 4, 2}; // Example array
        int unique = findUniqueInteger(nums);
        System.out.println("The unique integer is: " + unique);
    }
}

