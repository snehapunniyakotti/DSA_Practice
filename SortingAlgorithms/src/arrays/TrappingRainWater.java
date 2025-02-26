// 42. Trapping Rain Water
// Solved
// Hard
// Topics
// Companies
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

// Example 1:


// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
// Example 2:

// Input: height = [4,2,0,3,2,5]
// Output: 9
 

// Constraints:

// n == height.length
// 1 <= n <= 2 * 104
// 0 <= height[i] <= 105


class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] rigth = new int[height.length];
        left[0]=height[0];
        for(int i=1;i<height.length;i++){
            left[i] = Math.max(height[i],left[i-1]);
        }
        rigth[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rigth[i] = Math.max(height[i],rigth[i+1]);
        }
          int count =0;
         for(int i=0;i<height.length;i++){
            count+=(Math.min(left[i],rigth[i]))-height[i];
        }
        return count;
    }
}
