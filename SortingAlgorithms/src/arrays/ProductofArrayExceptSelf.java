// 238. Product of Array Except Self
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

 

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]
 

// Constraints:

// 2 <= nums.length <= 105
// -30 <= nums[i] <= 30
// The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
 

// Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)



class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] left_arr = new int[len];
        int[] right_arr = new int[len];
        int[] otp_arr = new int[len];

        left_arr[0]=1;
        for(int i=1;i<len;i++){
            left_arr[i] = nums[i-1] * left_arr[i-1];
        } 
        right_arr[len-1]=1;
        for(int i = len-2;i>=0;i--){
            right_arr[i] = nums[i+1]*right_arr[i+1];
        }
        for(int i=0;i<len;i++){
            otp_arr[i]=left_arr[i]*right_arr[i];
        }
        return otp_arr;
    }
}